package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.daogen2.Classe
import org.xtext.daogen2.InsertCode
import org.xtext.daogen2.InserirObjeto
import org.xtext.daogen2.BuscarObjeto
import org.xtext.daogen2.ListarObjeto
import org.xtext.daogen2.AtualizarObjeto
import org.xtext.daogen2.RemoverObjeto
import org.xtext.daogen2.DeletarTabela
import org.xtext.daogen2.Atributo

import org.eclipse.xtext.naming.IQualifiedNameProvider

import com.google.inject.Inject

class Daogen2Generator extends AbstractGenerator {
 
    @Inject extension IQualifiedNameProvider
 
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        for (e : resource.allContents.toIterable.filter(Classe)) {
            fsa.generateFile(
                e.fullyQualifiedName.toString("/") + ".java",
                e.compile)
        }
    }
 
    def compile(Classe e) '''
public class «e.name»DAO {
	«FOR a:e.features.filter(Atributo)»
		«a.compile»
	«ENDFOR»
 
	«FOR i:e.features.filter(InsertCode)»
		«i.compile(e)»
	«ENDFOR»
}
    '''
 
    def compile(Atributo a) '''
      private «a.type.name» «a.name»;
    '''
 
    def compile(InsertCode i, Classe c) '''
        «i.parametro.compileInsertCodeParametro(c)»
    '''
   
    def dispatch compileInsertCodeParametro(InserirObjeto ic, Classe c) '''
          private final static String INSERIR_«c.name.toUpperCase»_SQL = "insert into «c.name»"
          	+ " («FOR a:c.features.filter(Atributo) SEPARATOR ', '»«a.name»«ENDFOR»)"
          	+ " values («FOR a:c.features.filter(Atributo) SEPARATOR ', '»?«ENDFOR»)";
          
    '''
   
    def dispatch compileInsertCodeParametro(BuscarObjeto bc, Classe c) '''
          private final static String BUSCAR_«c.name.toUpperCase»_POR_«bc.atr.name.toUpperCase»_SQL = "select"
          	+ " «FOR a:c.features.filter(Atributo) SEPARATOR ', '»«a.name»«ENDFOR»"
          	+ " from «c.name»"
          	+ " where («bc.atr.name»=?)";
          
    '''
    
    def dispatch compileInsertCodeParametro(ListarObjeto lc, Classe c) '''
          private final static String LISTAR_«c.name.toUpperCase»S_SQL = "select"
          	+ " «FOR a:c.features.filter(Atributo) SEPARATOR ', '»«c.name.toFirstLower().charAt(0)».«a.name» as «c.name»«a.name.toFirstUpper()»«ENDFOR»"
          	+ " from «c.name.toFirstUpper()» «c.name.toFirstLower().charAt(0)»";
          
    '''
    def dispatch compileInsertCodeParametro(RemoverObjeto rc, Classe c) '''
    	 private final static String REMOVER_«c.name.toUpperCase»_SQL = "delete"
    	 	+ " from «c.name»"
    	 	+ " where («rc.atr.name»=?)";
    '''
    def dispatch compileInsertCodeParametro(AtualizarObjeto ac, Classe c) '''
     private final static String ATUALIZA_«c.name.toUpperCase»_SQL = "update"
     	+ " «c.name»"
     	+ " set «ac.atr.name» = ?"
     	+ " where («ac.atr.name»=?)";
  	'''
  	
  	def dispatch compileInsertCodeParametro(DeletarTabela dt, Classe c) '''
     private final static String DELETAR_«c.name.toUpperCase»_SQL = "drop table"
     	+ " «c.name»";
  	'''
 
 
}
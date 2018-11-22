package org.xtext.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.daogen2.Atributo;
import org.xtext.daogen2.AtualizarObjeto;
import org.xtext.daogen2.BuscarObjeto;
import org.xtext.daogen2.Classe;
import org.xtext.daogen2.DeletarTabela;
import org.xtext.daogen2.InserirObjeto;
import org.xtext.daogen2.InsertCode;
import org.xtext.daogen2.ListarObjeto;
import org.xtext.daogen2.Parametro;
import org.xtext.daogen2.RemoverObjeto;

@SuppressWarnings("all")
public class Daogen2Generator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Classe> _filter = Iterables.<Classe>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Classe.class);
    for (final Classe e : _filter) {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/");
      String _plus = (_string + ".java");
      fsa.generateFile(_plus, 
        this.compile(e));
    }
  }
  
  public CharSequence compile(final Classe e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append("DAO {");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Atributo> _filter = Iterables.<Atributo>filter(e.getFeatures(), Atributo.class);
      for(final Atributo a : _filter) {
        _builder.append("\t");
        CharSequence _compile = this.compile(a);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.newLine();
    {
      Iterable<InsertCode> _filter_1 = Iterables.<InsertCode>filter(e.getFeatures(), InsertCode.class);
      for(final InsertCode i : _filter_1) {
        _builder.append("\t");
        CharSequence _compile_1 = this.compile(i, e);
        _builder.append(_compile_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Atributo a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    String _name = a.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _name_1 = a.getName();
    _builder.append(_name_1);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final InsertCode i, final Classe c) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileInsertCodeParametro = this.compileInsertCodeParametro(i.getParametro(), c);
    _builder.append(_compileInsertCodeParametro);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compileInsertCodeParametro(final InserirObjeto ic, final Classe c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final static String INSERIR_");
    String _upperCase = c.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("_SQL = \"insert into ");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" (");
    {
      Iterable<Atributo> _filter = Iterables.<Atributo>filter(c.getFeatures(), Atributo.class);
      boolean _hasElements = false;
      for(final Atributo a : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        String _name_1 = a.getName();
        _builder.append(_name_1, "\t");
      }
    }
    _builder.append(")\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" values (");
    {
      Iterable<Atributo> _filter_1 = Iterables.<Atributo>filter(c.getFeatures(), Atributo.class);
      boolean _hasElements_1 = false;
      for(final Atributo a_1 : _filter_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("?");
      }
    }
    _builder.append(")\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compileInsertCodeParametro(final BuscarObjeto bc, final Classe c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final static String BUSCAR_");
    String _upperCase = c.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("_POR_");
    String _upperCase_1 = bc.getAtr().getName().toUpperCase();
    _builder.append(_upperCase_1);
    _builder.append("_SQL = \"select\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" ");
    {
      Iterable<Atributo> _filter = Iterables.<Atributo>filter(c.getFeatures(), Atributo.class);
      boolean _hasElements = false;
      for(final Atributo a : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        String _name = a.getName();
        _builder.append(_name, "\t");
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" from ");
    String _name_1 = c.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" where (");
    String _name_2 = bc.getAtr().getName();
    _builder.append(_name_2, "\t");
    _builder.append("=?)\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compileInsertCodeParametro(final ListarObjeto lc, final Classe c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final static String LISTAR_");
    String _upperCase = c.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("S_SQL = \"select\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" ");
    {
      Iterable<Atributo> _filter = Iterables.<Atributo>filter(c.getFeatures(), Atributo.class);
      boolean _hasElements = false;
      for(final Atributo a : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        char _charAt = StringExtensions.toFirstLower(c.getName()).charAt(0);
        _builder.append(_charAt, "\t");
        _builder.append(".");
        String _name = a.getName();
        _builder.append(_name, "\t");
        _builder.append(" as ");
        String _name_1 = c.getName();
        _builder.append(_name_1, "\t");
        String _firstUpper = StringExtensions.toFirstUpper(a.getName());
        _builder.append(_firstUpper, "\t");
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" from ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(c.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append(" ");
    char _charAt_1 = StringExtensions.toFirstLower(c.getName()).charAt(0);
    _builder.append(_charAt_1, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compileInsertCodeParametro(final RemoverObjeto rc, final Classe c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final static String REMOVER_");
    String _upperCase = c.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("_SQL = \"delete\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" from ");
    String _name = c.getName();
    _builder.append(_name, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" where (");
    String _name_1 = rc.getAtr().getName();
    _builder.append(_name_1, "\t");
    _builder.append("=?)\";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compileInsertCodeParametro(final AtualizarObjeto ac, final Classe c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final static String ATUALIZA_");
    String _upperCase = c.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("_SQL = \"update\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" ");
    String _name = c.getName();
    _builder.append(_name, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" set ");
    String _name_1 = ac.getAtr().getName();
    _builder.append(_name_1, "\t");
    _builder.append(" = ?\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" where (");
    String _name_2 = ac.getAtr().getName();
    _builder.append(_name_2, "\t");
    _builder.append("=?)\";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compileInsertCodeParametro(final DeletarTabela dt, final Classe c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private final static String DELETAR_");
    String _upperCase = c.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("_SQL = \"drop table\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("+ \" ");
    String _name = c.getName();
    _builder.append(_name, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileInsertCodeParametro(final Parametro ac, final Classe c) {
    if (ac instanceof AtualizarObjeto) {
      return _compileInsertCodeParametro((AtualizarObjeto)ac, c);
    } else if (ac instanceof BuscarObjeto) {
      return _compileInsertCodeParametro((BuscarObjeto)ac, c);
    } else if (ac instanceof DeletarTabela) {
      return _compileInsertCodeParametro((DeletarTabela)ac, c);
    } else if (ac instanceof InserirObjeto) {
      return _compileInsertCodeParametro((InserirObjeto)ac, c);
    } else if (ac instanceof ListarObjeto) {
      return _compileInsertCodeParametro((ListarObjeto)ac, c);
    } else if (ac instanceof RemoverObjeto) {
      return _compileInsertCodeParametro((RemoverObjeto)ac, c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ac, c).toString());
    }
  }
}

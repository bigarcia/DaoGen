/**
 * generated by Xtext 2.15.0
 */
package org.xtext.daogen2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.daogen2.Daogen2Factory
 * @model kind="package"
 * @generated
 */
public interface Daogen2Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "daogen2";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Daogen2";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "daogen2";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Daogen2Package eINSTANCE = org.xtext.daogen2.impl.Daogen2PackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.DaogenImpl <em>Daogen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.DaogenImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getDaogen()
   * @generated
   */
  int DAOGEN = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Daogen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.TypeImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.DataTypeImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.ClasseImpl <em>Classe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.ClasseImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getClasse()
   * @generated
   */
  int CLASSE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSE__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSE__FEATURES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Classe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.FeatureImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 4;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.AtributoImpl <em>Atributo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.AtributoImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getAtributo()
   * @generated
   */
  int ATRIBUTO = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__TYPE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__NAME = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Atributo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.InsertCodeImpl <em>Insert Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.InsertCodeImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getInsertCode()
   * @generated
   */
  int INSERT_CODE = 6;

  /**
   * The feature id for the '<em><b>Parametro</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_CODE__PARAMETRO = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Insert Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_CODE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.ParametroImpl <em>Parametro</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.ParametroImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getParametro()
   * @generated
   */
  int PARAMETRO = 7;

  /**
   * The number of structural features of the '<em>Parametro</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.InserirObjetoImpl <em>Inserir Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.InserirObjetoImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getInserirObjeto()
   * @generated
   */
  int INSERIR_OBJETO = 8;

  /**
   * The number of structural features of the '<em>Inserir Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERIR_OBJETO_FEATURE_COUNT = PARAMETRO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.BuscarObjetoImpl <em>Buscar Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.BuscarObjetoImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getBuscarObjeto()
   * @generated
   */
  int BUSCAR_OBJETO = 9;

  /**
   * The feature id for the '<em><b>Atr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSCAR_OBJETO__ATR = PARAMETRO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Buscar Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSCAR_OBJETO_FEATURE_COUNT = PARAMETRO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.ListarObjetoImpl <em>Listar Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.ListarObjetoImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getListarObjeto()
   * @generated
   */
  int LISTAR_OBJETO = 10;

  /**
   * The number of structural features of the '<em>Listar Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTAR_OBJETO_FEATURE_COUNT = PARAMETRO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.RemoverObjetoImpl <em>Remover Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.RemoverObjetoImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getRemoverObjeto()
   * @generated
   */
  int REMOVER_OBJETO = 11;

  /**
   * The feature id for the '<em><b>Atr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVER_OBJETO__ATR = PARAMETRO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Remover Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVER_OBJETO_FEATURE_COUNT = PARAMETRO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.AtualizarObjetoImpl <em>Atualizar Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.AtualizarObjetoImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getAtualizarObjeto()
   * @generated
   */
  int ATUALIZAR_OBJETO = 12;

  /**
   * The feature id for the '<em><b>Atr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATUALIZAR_OBJETO__ATR = PARAMETRO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atualizar Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATUALIZAR_OBJETO_FEATURE_COUNT = PARAMETRO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.daogen2.impl.DeletarTabelaImpl <em>Deletar Tabela</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.daogen2.impl.DeletarTabelaImpl
   * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getDeletarTabela()
   * @generated
   */
  int DELETAR_TABELA = 13;

  /**
   * The number of structural features of the '<em>Deletar Tabela</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETAR_TABELA_FEATURE_COUNT = PARAMETRO_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.Daogen <em>Daogen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daogen</em>'.
   * @see org.xtext.daogen2.Daogen
   * @generated
   */
  EClass getDaogen();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.daogen2.Daogen#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.daogen2.Daogen#getElements()
   * @see #getDaogen()
   * @generated
   */
  EReference getDaogen_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.daogen2.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.daogen2.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.daogen2.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.xtext.daogen2.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.Classe <em>Classe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classe</em>'.
   * @see org.xtext.daogen2.Classe
   * @generated
   */
  EClass getClasse();

  /**
   * Returns the meta object for the reference '{@link org.xtext.daogen2.Classe#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.xtext.daogen2.Classe#getSuperType()
   * @see #getClasse()
   * @generated
   */
  EReference getClasse_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.daogen2.Classe#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.xtext.daogen2.Classe#getFeatures()
   * @see #getClasse()
   * @generated
   */
  EReference getClasse_Features();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.xtext.daogen2.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.Atributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo</em>'.
   * @see org.xtext.daogen2.Atributo
   * @generated
   */
  EClass getAtributo();

  /**
   * Returns the meta object for the reference '{@link org.xtext.daogen2.Atributo#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.daogen2.Atributo#getType()
   * @see #getAtributo()
   * @generated
   */
  EReference getAtributo_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.daogen2.Atributo#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.daogen2.Atributo#getName()
   * @see #getAtributo()
   * @generated
   */
  EAttribute getAtributo_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.InsertCode <em>Insert Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Code</em>'.
   * @see org.xtext.daogen2.InsertCode
   * @generated
   */
  EClass getInsertCode();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.daogen2.InsertCode#getParametro <em>Parametro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parametro</em>'.
   * @see org.xtext.daogen2.InsertCode#getParametro()
   * @see #getInsertCode()
   * @generated
   */
  EReference getInsertCode_Parametro();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.Parametro <em>Parametro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parametro</em>'.
   * @see org.xtext.daogen2.Parametro
   * @generated
   */
  EClass getParametro();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.InserirObjeto <em>Inserir Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inserir Objeto</em>'.
   * @see org.xtext.daogen2.InserirObjeto
   * @generated
   */
  EClass getInserirObjeto();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.BuscarObjeto <em>Buscar Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Buscar Objeto</em>'.
   * @see org.xtext.daogen2.BuscarObjeto
   * @generated
   */
  EClass getBuscarObjeto();

  /**
   * Returns the meta object for the reference '{@link org.xtext.daogen2.BuscarObjeto#getAtr <em>Atr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Atr</em>'.
   * @see org.xtext.daogen2.BuscarObjeto#getAtr()
   * @see #getBuscarObjeto()
   * @generated
   */
  EReference getBuscarObjeto_Atr();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.ListarObjeto <em>Listar Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Listar Objeto</em>'.
   * @see org.xtext.daogen2.ListarObjeto
   * @generated
   */
  EClass getListarObjeto();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.RemoverObjeto <em>Remover Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remover Objeto</em>'.
   * @see org.xtext.daogen2.RemoverObjeto
   * @generated
   */
  EClass getRemoverObjeto();

  /**
   * Returns the meta object for the reference '{@link org.xtext.daogen2.RemoverObjeto#getAtr <em>Atr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Atr</em>'.
   * @see org.xtext.daogen2.RemoverObjeto#getAtr()
   * @see #getRemoverObjeto()
   * @generated
   */
  EReference getRemoverObjeto_Atr();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.AtualizarObjeto <em>Atualizar Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atualizar Objeto</em>'.
   * @see org.xtext.daogen2.AtualizarObjeto
   * @generated
   */
  EClass getAtualizarObjeto();

  /**
   * Returns the meta object for the reference '{@link org.xtext.daogen2.AtualizarObjeto#getAtr <em>Atr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Atr</em>'.
   * @see org.xtext.daogen2.AtualizarObjeto#getAtr()
   * @see #getAtualizarObjeto()
   * @generated
   */
  EReference getAtualizarObjeto_Atr();

  /**
   * Returns the meta object for class '{@link org.xtext.daogen2.DeletarTabela <em>Deletar Tabela</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deletar Tabela</em>'.
   * @see org.xtext.daogen2.DeletarTabela
   * @generated
   */
  EClass getDeletarTabela();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Daogen2Factory getDaogen2Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.DaogenImpl <em>Daogen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.DaogenImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getDaogen()
     * @generated
     */
    EClass DAOGEN = eINSTANCE.getDaogen();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN__ELEMENTS = eINSTANCE.getDaogen_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.TypeImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.DataTypeImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.ClasseImpl <em>Classe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.ClasseImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getClasse()
     * @generated
     */
    EClass CLASSE = eINSTANCE.getClasse();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSE__SUPER_TYPE = eINSTANCE.getClasse_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSE__FEATURES = eINSTANCE.getClasse_Features();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.FeatureImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.AtributoImpl <em>Atributo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.AtributoImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getAtributo()
     * @generated
     */
    EClass ATRIBUTO = eINSTANCE.getAtributo();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTO__TYPE = eINSTANCE.getAtributo_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO__NAME = eINSTANCE.getAtributo_Name();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.InsertCodeImpl <em>Insert Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.InsertCodeImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getInsertCode()
     * @generated
     */
    EClass INSERT_CODE = eINSTANCE.getInsertCode();

    /**
     * The meta object literal for the '<em><b>Parametro</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_CODE__PARAMETRO = eINSTANCE.getInsertCode_Parametro();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.ParametroImpl <em>Parametro</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.ParametroImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getParametro()
     * @generated
     */
    EClass PARAMETRO = eINSTANCE.getParametro();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.InserirObjetoImpl <em>Inserir Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.InserirObjetoImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getInserirObjeto()
     * @generated
     */
    EClass INSERIR_OBJETO = eINSTANCE.getInserirObjeto();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.BuscarObjetoImpl <em>Buscar Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.BuscarObjetoImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getBuscarObjeto()
     * @generated
     */
    EClass BUSCAR_OBJETO = eINSTANCE.getBuscarObjeto();

    /**
     * The meta object literal for the '<em><b>Atr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSCAR_OBJETO__ATR = eINSTANCE.getBuscarObjeto_Atr();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.ListarObjetoImpl <em>Listar Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.ListarObjetoImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getListarObjeto()
     * @generated
     */
    EClass LISTAR_OBJETO = eINSTANCE.getListarObjeto();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.RemoverObjetoImpl <em>Remover Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.RemoverObjetoImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getRemoverObjeto()
     * @generated
     */
    EClass REMOVER_OBJETO = eINSTANCE.getRemoverObjeto();

    /**
     * The meta object literal for the '<em><b>Atr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REMOVER_OBJETO__ATR = eINSTANCE.getRemoverObjeto_Atr();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.AtualizarObjetoImpl <em>Atualizar Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.AtualizarObjetoImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getAtualizarObjeto()
     * @generated
     */
    EClass ATUALIZAR_OBJETO = eINSTANCE.getAtualizarObjeto();

    /**
     * The meta object literal for the '<em><b>Atr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATUALIZAR_OBJETO__ATR = eINSTANCE.getAtualizarObjeto_Atr();

    /**
     * The meta object literal for the '{@link org.xtext.daogen2.impl.DeletarTabelaImpl <em>Deletar Tabela</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.daogen2.impl.DeletarTabelaImpl
     * @see org.xtext.daogen2.impl.Daogen2PackageImpl#getDeletarTabela()
     * @generated
     */
    EClass DELETAR_TABELA = eINSTANCE.getDeletarTabela();

  }

} //Daogen2Package

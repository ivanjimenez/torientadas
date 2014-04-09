/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package umlMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM.Package#getName <em>Name</em>}</li>
 *   <li>{@link umlMM.Package#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM.UmlMMPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see umlMM.UmlMMPackage#getPackage_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlMM.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference list.
	 * The list contents are of type {@link umlMM.Associaton}.
	 * It is bidirectional and its opposite is '{@link umlMM.Associaton#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference list.
	 * @see umlMM.UmlMMPackage#getPackage_Association()
	 * @see umlMM.Associaton#getNamespace
	 * @model opposite="namespace"
	 * @generated
	 */
	EList<Associaton> getAssociation();

} // Package

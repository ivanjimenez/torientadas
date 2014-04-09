/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package umlMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM.Class#getSourceOf <em>Source Of</em>}</li>
 *   <li>{@link umlMM.Class#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link umlMM.Class#getDestintationOf <em>Destintation Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM.UmlMMPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Source Of</b></em>' reference list.
	 * The list contents are of type {@link umlMM.Associaton}.
	 * It is bidirectional and its opposite is '{@link umlMM.Associaton#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Of</em>' reference list.
	 * @see umlMM.UmlMMPackage#getClass_SourceOf()
	 * @see umlMM.Associaton#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Associaton> getSourceOf();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link umlMM.Attribute}.
	 * It is bidirectional and its opposite is '{@link umlMM.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see umlMM.UmlMMPackage#getClass_Attribute()
	 * @see umlMM.Attribute#getOwner
	 * @model opposite="Owner"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Destintation Of</b></em>' reference list.
	 * The list contents are of type {@link umlMM.Associaton}.
	 * It is bidirectional and its opposite is '{@link umlMM.Associaton#getDestintation <em>Destintation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destintation Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destintation Of</em>' reference list.
	 * @see umlMM.UmlMMPackage#getClass_DestintationOf()
	 * @see umlMM.Associaton#getDestintation
	 * @model opposite="destintation"
	 * @generated
	 */
	EList<Associaton> getDestintationOf();

} // Class

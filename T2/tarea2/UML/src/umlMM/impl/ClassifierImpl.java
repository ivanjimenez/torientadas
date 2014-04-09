/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package umlMM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import umlMM.Attribute;
import umlMM.Classifier;
import umlMM.UmlMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlMM.impl.ClassifierImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlMM.impl.ClassifierImpl#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link umlMM.impl.ClassifierImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierImpl extends EObjectImpl implements Classifier {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeOf() <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOf()
	 * @generated
	 * @ordered
	 */
	protected Attribute typeOf;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected umlMM.Package namespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlMMPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.CLASSIFIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getTypeOf() {
		if (typeOf != null && typeOf.eIsProxy()) {
			InternalEObject oldTypeOf = (InternalEObject)typeOf;
			typeOf = (Attribute)eResolveProxy(oldTypeOf);
			if (typeOf != oldTypeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlMMPackage.CLASSIFIER__TYPE_OF, oldTypeOf, typeOf));
			}
		}
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetTypeOf() {
		return typeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeOf(Attribute newTypeOf, NotificationChain msgs) {
		Attribute oldTypeOf = typeOf;
		typeOf = newTypeOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlMMPackage.CLASSIFIER__TYPE_OF, oldTypeOf, newTypeOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOf(Attribute newTypeOf) {
		if (newTypeOf != typeOf) {
			NotificationChain msgs = null;
			if (typeOf != null)
				msgs = ((InternalEObject)typeOf).eInverseRemove(this, UmlMMPackage.ATTRIBUTE__TYPE, Attribute.class, msgs);
			if (newTypeOf != null)
				msgs = ((InternalEObject)newTypeOf).eInverseAdd(this, UmlMMPackage.ATTRIBUTE__TYPE, Attribute.class, msgs);
			msgs = basicSetTypeOf(newTypeOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.CLASSIFIER__TYPE_OF, newTypeOf, newTypeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlMM.Package getNamespace() {
		if (namespace != null && namespace.eIsProxy()) {
			InternalEObject oldNamespace = (InternalEObject)namespace;
			namespace = (umlMM.Package)eResolveProxy(oldNamespace);
			if (namespace != oldNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlMMPackage.CLASSIFIER__NAMESPACE, oldNamespace, namespace));
			}
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlMM.Package basicGetNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(umlMM.Package newNamespace) {
		umlMM.Package oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.CLASSIFIER__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlMMPackage.CLASSIFIER__TYPE_OF:
				if (typeOf != null)
					msgs = ((InternalEObject)typeOf).eInverseRemove(this, UmlMMPackage.ATTRIBUTE__TYPE, Attribute.class, msgs);
				return basicSetTypeOf((Attribute)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlMMPackage.CLASSIFIER__TYPE_OF:
				return basicSetTypeOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmlMMPackage.CLASSIFIER__NAME:
				return getName();
			case UmlMMPackage.CLASSIFIER__TYPE_OF:
				if (resolve) return getTypeOf();
				return basicGetTypeOf();
			case UmlMMPackage.CLASSIFIER__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmlMMPackage.CLASSIFIER__NAME:
				setName((String)newValue);
				return;
			case UmlMMPackage.CLASSIFIER__TYPE_OF:
				setTypeOf((Attribute)newValue);
				return;
			case UmlMMPackage.CLASSIFIER__NAMESPACE:
				setNamespace((umlMM.Package)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UmlMMPackage.CLASSIFIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlMMPackage.CLASSIFIER__TYPE_OF:
				setTypeOf((Attribute)null);
				return;
			case UmlMMPackage.CLASSIFIER__NAMESPACE:
				setNamespace((umlMM.Package)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UmlMMPackage.CLASSIFIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlMMPackage.CLASSIFIER__TYPE_OF:
				return typeOf != null;
			case UmlMMPackage.CLASSIFIER__NAMESPACE:
				return namespace != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl

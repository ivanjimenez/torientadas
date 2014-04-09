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

import umlMM.Associaton;
import umlMM.UmlMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Associaton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlMM.impl.AssociatonImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlMM.impl.AssociatonImpl#getSource <em>Source</em>}</li>
 *   <li>{@link umlMM.impl.AssociatonImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link umlMM.impl.AssociatonImpl#getDestintation <em>Destintation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociatonImpl extends EObjectImpl implements Associaton {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected umlMM.Class source;

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
	 * The cached value of the '{@link #getDestintation() <em>Destintation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestintation()
	 * @generated
	 * @ordered
	 */
	protected umlMM.Class destintation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociatonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlMMPackage.Literals.ASSOCIATON;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlMMPackage.ASSOCIATON__NAMESPACE, oldNamespace, namespace));
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
	public NotificationChain basicSetNamespace(umlMM.Package newNamespace, NotificationChain msgs) {
		umlMM.Package oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlMMPackage.ASSOCIATON__NAMESPACE, oldNamespace, newNamespace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(umlMM.Package newNamespace) {
		if (newNamespace != namespace) {
			NotificationChain msgs = null;
			if (namespace != null)
				msgs = ((InternalEObject)namespace).eInverseRemove(this, UmlMMPackage.PACKAGE__ASSOCIATION, umlMM.Package.class, msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, UmlMMPackage.PACKAGE__ASSOCIATION, umlMM.Package.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.ASSOCIATON__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlMM.Class getDestintation() {
		if (destintation != null && destintation.eIsProxy()) {
			InternalEObject oldDestintation = (InternalEObject)destintation;
			destintation = (umlMM.Class)eResolveProxy(oldDestintation);
			if (destintation != oldDestintation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlMMPackage.ASSOCIATON__DESTINTATION, oldDestintation, destintation));
			}
		}
		return destintation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlMM.Class basicGetDestintation() {
		return destintation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestintation(umlMM.Class newDestintation, NotificationChain msgs) {
		umlMM.Class oldDestintation = destintation;
		destintation = newDestintation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlMMPackage.ASSOCIATON__DESTINTATION, oldDestintation, newDestintation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestintation(umlMM.Class newDestintation) {
		if (newDestintation != destintation) {
			NotificationChain msgs = null;
			if (destintation != null)
				msgs = ((InternalEObject)destintation).eInverseRemove(this, UmlMMPackage.CLASS__DESTINTATION_OF, umlMM.Class.class, msgs);
			if (newDestintation != null)
				msgs = ((InternalEObject)newDestintation).eInverseAdd(this, UmlMMPackage.CLASS__DESTINTATION_OF, umlMM.Class.class, msgs);
			msgs = basicSetDestintation(newDestintation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.ASSOCIATON__DESTINTATION, newDestintation, newDestintation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.ASSOCIATON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlMM.Class getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (umlMM.Class)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlMMPackage.ASSOCIATON__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlMM.Class basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(umlMM.Class newSource, NotificationChain msgs) {
		umlMM.Class oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlMMPackage.ASSOCIATON__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(umlMM.Class newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, UmlMMPackage.CLASS__SOURCE_OF, umlMM.Class.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, UmlMMPackage.CLASS__SOURCE_OF, umlMM.Class.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.ASSOCIATON__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlMMPackage.ASSOCIATON__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, UmlMMPackage.CLASS__SOURCE_OF, umlMM.Class.class, msgs);
				return basicSetSource((umlMM.Class)otherEnd, msgs);
			case UmlMMPackage.ASSOCIATON__NAMESPACE:
				if (namespace != null)
					msgs = ((InternalEObject)namespace).eInverseRemove(this, UmlMMPackage.PACKAGE__ASSOCIATION, umlMM.Package.class, msgs);
				return basicSetNamespace((umlMM.Package)otherEnd, msgs);
			case UmlMMPackage.ASSOCIATON__DESTINTATION:
				if (destintation != null)
					msgs = ((InternalEObject)destintation).eInverseRemove(this, UmlMMPackage.CLASS__DESTINTATION_OF, umlMM.Class.class, msgs);
				return basicSetDestintation((umlMM.Class)otherEnd, msgs);
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
			case UmlMMPackage.ASSOCIATON__SOURCE:
				return basicSetSource(null, msgs);
			case UmlMMPackage.ASSOCIATON__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case UmlMMPackage.ASSOCIATON__DESTINTATION:
				return basicSetDestintation(null, msgs);
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
			case UmlMMPackage.ASSOCIATON__NAME:
				return getName();
			case UmlMMPackage.ASSOCIATON__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UmlMMPackage.ASSOCIATON__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
			case UmlMMPackage.ASSOCIATON__DESTINTATION:
				if (resolve) return getDestintation();
				return basicGetDestintation();
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
			case UmlMMPackage.ASSOCIATON__NAME:
				setName((String)newValue);
				return;
			case UmlMMPackage.ASSOCIATON__SOURCE:
				setSource((umlMM.Class)newValue);
				return;
			case UmlMMPackage.ASSOCIATON__NAMESPACE:
				setNamespace((umlMM.Package)newValue);
				return;
			case UmlMMPackage.ASSOCIATON__DESTINTATION:
				setDestintation((umlMM.Class)newValue);
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
			case UmlMMPackage.ASSOCIATON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlMMPackage.ASSOCIATON__SOURCE:
				setSource((umlMM.Class)null);
				return;
			case UmlMMPackage.ASSOCIATON__NAMESPACE:
				setNamespace((umlMM.Package)null);
				return;
			case UmlMMPackage.ASSOCIATON__DESTINTATION:
				setDestintation((umlMM.Class)null);
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
			case UmlMMPackage.ASSOCIATON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlMMPackage.ASSOCIATON__SOURCE:
				return source != null;
			case UmlMMPackage.ASSOCIATON__NAMESPACE:
				return namespace != null;
			case UmlMMPackage.ASSOCIATON__DESTINTATION:
				return destintation != null;
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

} //AssociatonImpl

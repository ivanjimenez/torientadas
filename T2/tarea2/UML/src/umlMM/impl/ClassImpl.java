/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package umlMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlMM.Associaton;
import umlMM.Attribute;
import umlMM.UmlMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlMM.impl.ClassImpl#getSourceOf <em>Source Of</em>}</li>
 *   <li>{@link umlMM.impl.ClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link umlMM.impl.ClassImpl#getDestintationOf <em>Destintation Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements umlMM.Class {
	/**
	 * The cached value of the '{@link #getSourceOf() <em>Source Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Associaton> sourceOf;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getDestintationOf() <em>Destintation Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestintationOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Associaton> destintationOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlMMPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Associaton> getSourceOf() {
		if (sourceOf == null) {
			sourceOf = new EObjectWithInverseResolvingEList<Associaton>(Associaton.class, this, UmlMMPackage.CLASS__SOURCE_OF, UmlMMPackage.ASSOCIATON__SOURCE);
		}
		return sourceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectWithInverseResolvingEList<Attribute>(Attribute.class, this, UmlMMPackage.CLASS__ATTRIBUTE, UmlMMPackage.ATTRIBUTE__OWNER);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Associaton> getDestintationOf() {
		if (destintationOf == null) {
			destintationOf = new EObjectWithInverseResolvingEList<Associaton>(Associaton.class, this, UmlMMPackage.CLASS__DESTINTATION_OF, UmlMMPackage.ASSOCIATON__DESTINTATION);
		}
		return destintationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlMMPackage.CLASS__SOURCE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceOf()).basicAdd(otherEnd, msgs);
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttribute()).basicAdd(otherEnd, msgs);
			case UmlMMPackage.CLASS__DESTINTATION_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDestintationOf()).basicAdd(otherEnd, msgs);
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
			case UmlMMPackage.CLASS__SOURCE_OF:
				return ((InternalEList<?>)getSourceOf()).basicRemove(otherEnd, msgs);
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case UmlMMPackage.CLASS__DESTINTATION_OF:
				return ((InternalEList<?>)getDestintationOf()).basicRemove(otherEnd, msgs);
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
			case UmlMMPackage.CLASS__SOURCE_OF:
				return getSourceOf();
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return getAttribute();
			case UmlMMPackage.CLASS__DESTINTATION_OF:
				return getDestintationOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmlMMPackage.CLASS__SOURCE_OF:
				getSourceOf().clear();
				getSourceOf().addAll((Collection<? extends Associaton>)newValue);
				return;
			case UmlMMPackage.CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case UmlMMPackage.CLASS__DESTINTATION_OF:
				getDestintationOf().clear();
				getDestintationOf().addAll((Collection<? extends Associaton>)newValue);
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
			case UmlMMPackage.CLASS__SOURCE_OF:
				getSourceOf().clear();
				return;
			case UmlMMPackage.CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case UmlMMPackage.CLASS__DESTINTATION_OF:
				getDestintationOf().clear();
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
			case UmlMMPackage.CLASS__SOURCE_OF:
				return sourceOf != null && !sourceOf.isEmpty();
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case UmlMMPackage.CLASS__DESTINTATION_OF:
				return destintationOf != null && !destintationOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl

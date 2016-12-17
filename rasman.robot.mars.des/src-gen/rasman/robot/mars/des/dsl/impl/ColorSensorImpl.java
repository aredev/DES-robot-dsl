/**
 * generated by Xtext 2.10.0
 */
package rasman.robot.mars.des.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rasman.robot.mars.des.dsl.ColorSensor;
import rasman.robot.mars.des.dsl.ColorValue;
import rasman.robot.mars.des.dsl.DslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rasman.robot.mars.des.dsl.impl.ColorSensorImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link rasman.robot.mars.des.dsl.impl.ColorSensorImpl#getKey <em>Key</em>}</li>
 *   <li>{@link rasman.robot.mars.des.dsl.impl.ColorSensorImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorSensorImpl extends SensorTypeImpl implements ColorSensor
{
  /**
   * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistinct()
   * @generated
   * @ordered
   */
  protected static final boolean DISTINCT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistinct()
   * @generated
   * @ordered
   */
  protected boolean distinct = DISTINCT_EDEFAULT;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected ColorValue key;

  /**
   * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeys()
   * @generated
   * @ordered
   */
  protected EList<ColorValue> keys;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorSensorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.COLOR_SENSOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDistinct()
  {
    return distinct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistinct(boolean newDistinct)
  {
    boolean oldDistinct = distinct;
    distinct = newDistinct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COLOR_SENSOR__DISTINCT, oldDistinct, distinct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorValue getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKey(ColorValue newKey, NotificationChain msgs)
  {
    ColorValue oldKey = key;
    key = newKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.COLOR_SENSOR__KEY, oldKey, newKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(ColorValue newKey)
  {
    if (newKey != key)
    {
      NotificationChain msgs = null;
      if (key != null)
        msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.COLOR_SENSOR__KEY, null, msgs);
      if (newKey != null)
        msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.COLOR_SENSOR__KEY, null, msgs);
      msgs = basicSetKey(newKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COLOR_SENSOR__KEY, newKey, newKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColorValue> getKeys()
  {
    if (keys == null)
    {
      keys = new EObjectContainmentEList<ColorValue>(ColorValue.class, this, DslPackage.COLOR_SENSOR__KEYS);
    }
    return keys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslPackage.COLOR_SENSOR__KEY:
        return basicSetKey(null, msgs);
      case DslPackage.COLOR_SENSOR__KEYS:
        return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.COLOR_SENSOR__DISTINCT:
        return isDistinct();
      case DslPackage.COLOR_SENSOR__KEY:
        return getKey();
      case DslPackage.COLOR_SENSOR__KEYS:
        return getKeys();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.COLOR_SENSOR__DISTINCT:
        setDistinct((Boolean)newValue);
        return;
      case DslPackage.COLOR_SENSOR__KEY:
        setKey((ColorValue)newValue);
        return;
      case DslPackage.COLOR_SENSOR__KEYS:
        getKeys().clear();
        getKeys().addAll((Collection<? extends ColorValue>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.COLOR_SENSOR__DISTINCT:
        setDistinct(DISTINCT_EDEFAULT);
        return;
      case DslPackage.COLOR_SENSOR__KEY:
        setKey((ColorValue)null);
        return;
      case DslPackage.COLOR_SENSOR__KEYS:
        getKeys().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.COLOR_SENSOR__DISTINCT:
        return distinct != DISTINCT_EDEFAULT;
      case DslPackage.COLOR_SENSOR__KEY:
        return key != null;
      case DslPackage.COLOR_SENSOR__KEYS:
        return keys != null && !keys.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (distinct: ");
    result.append(distinct);
    result.append(')');
    return result.toString();
  }

} //ColorSensorImpl

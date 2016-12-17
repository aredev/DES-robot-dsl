/**
 * generated by Xtext 2.10.0
 */
package rasman.robot.mars.des.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rasman.robot.mars.des.dsl.Task#getName <em>Name</em>}</li>
 *   <li>{@link rasman.robot.mars.des.dsl.Task#getSensor <em>Sensor</em>}</li>
 *   <li>{@link rasman.robot.mars.des.dsl.Task#getAction <em>Action</em>}</li>
 *   <li>{@link rasman.robot.mars.des.dsl.Task#getNrOfTimes <em>Nr Of Times</em>}</li>
 *   <li>{@link rasman.robot.mars.des.dsl.Task#getIgnoreBehavior <em>Ignore Behavior</em>}</li>
 *   <li>{@link rasman.robot.mars.des.dsl.Task#getTime <em>Time</em>}</li>
 *   <li>{@link rasman.robot.mars.des.dsl.Task#getTimeunit <em>Timeunit</em>}</li>
 * </ul>
 *
 * @see rasman.robot.mars.des.dsl.DslPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rasman.robot.mars.des.dsl.DslPackage#getTask_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rasman.robot.mars.des.dsl.Task#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' containment reference.
   * @see #setSensor(SensorType)
   * @see rasman.robot.mars.des.dsl.DslPackage#getTask_Sensor()
   * @model containment="true"
   * @generated
   */
  SensorType getSensor();

  /**
   * Sets the value of the '{@link rasman.robot.mars.des.dsl.Task#getSensor <em>Sensor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' containment reference.
   * @see #getSensor()
   * @generated
   */
  void setSensor(SensorType value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute list.
   * The list contents are of type {@link rasman.robot.mars.des.dsl.Actions}.
   * The literals are from the enumeration {@link rasman.robot.mars.des.dsl.Actions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute list.
   * @see rasman.robot.mars.des.dsl.Actions
   * @see rasman.robot.mars.des.dsl.DslPackage#getTask_Action()
   * @model unique="false"
   * @generated
   */
  EList<Actions> getAction();

  /**
   * Returns the value of the '<em><b>Nr Of Times</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nr Of Times</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nr Of Times</em>' attribute.
   * @see #setNrOfTimes(int)
   * @see rasman.robot.mars.des.dsl.DslPackage#getTask_NrOfTimes()
   * @model
   * @generated
   */
  int getNrOfTimes();

  /**
   * Sets the value of the '{@link rasman.robot.mars.des.dsl.Task#getNrOfTimes <em>Nr Of Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nr Of Times</em>' attribute.
   * @see #getNrOfTimes()
   * @generated
   */
  void setNrOfTimes(int value);

  /**
   * Returns the value of the '<em><b>Ignore Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Behavior</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Behavior</em>' containment reference.
   * @see #setIgnoreBehavior(Ignorables)
   * @see rasman.robot.mars.des.dsl.DslPackage#getTask_IgnoreBehavior()
   * @model containment="true"
   * @generated
   */
  Ignorables getIgnoreBehavior();

  /**
   * Sets the value of the '{@link rasman.robot.mars.des.dsl.Task#getIgnoreBehavior <em>Ignore Behavior</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Behavior</em>' containment reference.
   * @see #getIgnoreBehavior()
   * @generated
   */
  void setIgnoreBehavior(Ignorables value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see rasman.robot.mars.des.dsl.DslPackage#getTask_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link rasman.robot.mars.des.dsl.Task#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

  /**
   * Returns the value of the '<em><b>Timeunit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeunit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeunit</em>' containment reference.
   * @see #setTimeunit(timeUnitValue)
   * @see rasman.robot.mars.des.dsl.DslPackage#getTask_Timeunit()
   * @model containment="true"
   * @generated
   */
  timeUnitValue getTimeunit();

  /**
   * Sets the value of the '{@link rasman.robot.mars.des.dsl.Task#getTimeunit <em>Timeunit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeunit</em>' containment reference.
   * @see #getTimeunit()
   * @generated
   */
  void setTimeunit(timeUnitValue value);

} // Task
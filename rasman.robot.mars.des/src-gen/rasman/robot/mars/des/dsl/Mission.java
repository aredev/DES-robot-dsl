/**
 * generated by Xtext 2.10.0
 */
package rasman.robot.mars.des.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rasman.robot.mars.des.dsl.Mission#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see rasman.robot.mars.des.dsl.DslPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject
{
  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link rasman.robot.mars.des.dsl.Task}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see rasman.robot.mars.des.dsl.DslPackage#getMission_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<Task> getTasks();

} // Mission
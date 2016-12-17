/**
 * generated by Xtext 2.10.0
 */
package rasman.robot.mars.des.dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rasman.robot.mars.des.dsl.DslPackage#getActions()
 * @model
 * @generated
 */
public enum Actions implements Enumerator
{
  /**
   * The '<em><b>ROTATE L</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROTATE_L_VALUE
   * @generated
   * @ordered
   */
  ROTATE_L(0, "ROTATE_L", "ROTATELEFT"),

  /**
   * The '<em><b>ROTATE R</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROTATE_R_VALUE
   * @generated
   * @ordered
   */
  ROTATE_R(1, "ROTATE_R", "ROTATERIGHT"),

  /**
   * The '<em><b>DRIVE FORWARD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DRIVE_FORWARD_VALUE
   * @generated
   * @ordered
   */
  DRIVE_FORWARD(2, "DRIVE_FORWARD", "DRIVEFORWARD"),

  /**
   * The '<em><b>DRIVE BACKWARD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DRIVE_BACKWARD_VALUE
   * @generated
   * @ordered
   */
  DRIVE_BACKWARD(3, "DRIVE_BACKWARD", "DRIVEBACKWARD"),

  /**
   * The '<em><b>STOP DRIVING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STOP_DRIVING_VALUE
   * @generated
   * @ordered
   */
  STOP_DRIVING(4, "STOP_DRIVING", "STOP"),

  /**
   * The '<em><b>TURN AROUND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TURN_AROUND_VALUE
   * @generated
   * @ordered
   */
  TURN_AROUND(5, "TURN_AROUND", "TURNAROUND"),

  /**
   * The '<em><b>BEEP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEEP_VALUE
   * @generated
   * @ordered
   */
  BEEP(6, "BEEP", "BEEP"),

  /**
   * The '<em><b>MEASURE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEASURE_VALUE
   * @generated
   * @ordered
   */
  MEASURE(7, "MEASURE", "MEASURE"),

  /**
   * The '<em><b>DRIVETOEDGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DRIVETOEDGE_VALUE
   * @generated
   * @ordered
   */
  DRIVETOEDGE(8, "DRIVETOEDGE", "DRIVETOEDGE");

  /**
   * The '<em><b>ROTATE L</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ROTATE L</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROTATE_L
   * @model literal="ROTATELEFT"
   * @generated
   * @ordered
   */
  public static final int ROTATE_L_VALUE = 0;

  /**
   * The '<em><b>ROTATE R</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ROTATE R</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROTATE_R
   * @model literal="ROTATERIGHT"
   * @generated
   * @ordered
   */
  public static final int ROTATE_R_VALUE = 1;

  /**
   * The '<em><b>DRIVE FORWARD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DRIVE FORWARD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DRIVE_FORWARD
   * @model literal="DRIVEFORWARD"
   * @generated
   * @ordered
   */
  public static final int DRIVE_FORWARD_VALUE = 2;

  /**
   * The '<em><b>DRIVE BACKWARD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DRIVE BACKWARD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DRIVE_BACKWARD
   * @model literal="DRIVEBACKWARD"
   * @generated
   * @ordered
   */
  public static final int DRIVE_BACKWARD_VALUE = 3;

  /**
   * The '<em><b>STOP DRIVING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STOP DRIVING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STOP_DRIVING
   * @model literal="STOP"
   * @generated
   * @ordered
   */
  public static final int STOP_DRIVING_VALUE = 4;

  /**
   * The '<em><b>TURN AROUND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TURN AROUND</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TURN_AROUND
   * @model literal="TURNAROUND"
   * @generated
   * @ordered
   */
  public static final int TURN_AROUND_VALUE = 5;

  /**
   * The '<em><b>BEEP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BEEP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEEP
   * @model
   * @generated
   * @ordered
   */
  public static final int BEEP_VALUE = 6;

  /**
   * The '<em><b>MEASURE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MEASURE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEASURE
   * @model
   * @generated
   * @ordered
   */
  public static final int MEASURE_VALUE = 7;

  /**
   * The '<em><b>DRIVETOEDGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DRIVETOEDGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DRIVETOEDGE
   * @model
   * @generated
   * @ordered
   */
  public static final int DRIVETOEDGE_VALUE = 8;

  /**
   * An array of all the '<em><b>Actions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Actions[] VALUES_ARRAY =
    new Actions[]
    {
      ROTATE_L,
      ROTATE_R,
      DRIVE_FORWARD,
      DRIVE_BACKWARD,
      STOP_DRIVING,
      TURN_AROUND,
      BEEP,
      MEASURE,
      DRIVETOEDGE,
    };

  /**
   * A public read-only list of all the '<em><b>Actions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Actions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Actions get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Actions result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Actions getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Actions result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Actions get(int value)
  {
    switch (value)
    {
      case ROTATE_L_VALUE: return ROTATE_L;
      case ROTATE_R_VALUE: return ROTATE_R;
      case DRIVE_FORWARD_VALUE: return DRIVE_FORWARD;
      case DRIVE_BACKWARD_VALUE: return DRIVE_BACKWARD;
      case STOP_DRIVING_VALUE: return STOP_DRIVING;
      case TURN_AROUND_VALUE: return TURN_AROUND;
      case BEEP_VALUE: return BEEP;
      case MEASURE_VALUE: return MEASURE;
      case DRIVETOEDGE_VALUE: return DRIVETOEDGE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Actions(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Actions

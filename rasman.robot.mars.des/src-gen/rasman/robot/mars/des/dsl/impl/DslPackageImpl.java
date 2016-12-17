/**
 * generated by Xtext 2.10.0
 */
package rasman.robot.mars.des.dsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rasman.robot.mars.des.dsl.Actions;
import rasman.robot.mars.des.dsl.ColorSensor;
import rasman.robot.mars.des.dsl.ColorValue;
import rasman.robot.mars.des.dsl.Colors;
import rasman.robot.mars.des.dsl.CompareOperator;
import rasman.robot.mars.des.dsl.Directions;
import rasman.robot.mars.des.dsl.DslFactory;
import rasman.robot.mars.des.dsl.DslPackage;
import rasman.robot.mars.des.dsl.Ignorables;
import rasman.robot.mars.des.dsl.Mission;
import rasman.robot.mars.des.dsl.SensorType;
import rasman.robot.mars.des.dsl.Task;
import rasman.robot.mars.des.dsl.TouchSensor;
import rasman.robot.mars.des.dsl.TouchSensorSides;
import rasman.robot.mars.des.dsl.UltrasonicSensor;
import rasman.robot.mars.des.dsl.timeUnit;
import rasman.robot.mars.des.dsl.timeUnitValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslPackageImpl extends EPackageImpl implements DslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass missionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeUnitValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ignorablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorSensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass touchSensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ultrasonicSensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum timeUnitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum touchSensorSidesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum actionsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum compareOperatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see rasman.robot.mars.des.dsl.DslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DslPackageImpl()
  {
    super(eNS_URI, DslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DslPackage init()
  {
    if (isInited) return (DslPackage)EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);

    // Obtain or create and register package
    DslPackageImpl theDslPackage = (DslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDslPackage.createPackageContents();

    // Initialize created meta-data
    theDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DslPackage.eNS_URI, theDslPackage);
    return theDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMission()
  {
    return missionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMission_Tasks()
  {
    return (EReference)missionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Name()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Sensor()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Action()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_NrOfTimes()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_IgnoreBehavior()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Time()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Timeunit()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettimeUnitValue()
  {
    return timeUnitValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute gettimeUnitValue_Unit()
  {
    return (EAttribute)timeUnitValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIgnorables()
  {
    return ignorablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIgnorables_AVOID_OBJECTS()
  {
    return (EAttribute)ignorablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensorType()
  {
    return sensorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorSensor()
  {
    return colorSensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorSensor_Distinct()
  {
    return (EAttribute)colorSensorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorSensor_Key()
  {
    return (EReference)colorSensorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorSensor_Keys()
  {
    return (EReference)colorSensorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTouchSensor()
  {
    return touchSensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTouchSensor_Key()
  {
    return (EAttribute)touchSensorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUltrasonicSensor()
  {
    return ultrasonicSensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUltrasonicSensor_Comparator()
  {
    return (EAttribute)ultrasonicSensorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUltrasonicSensor_Distance()
  {
    return (EAttribute)ultrasonicSensorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorValue()
  {
    return colorValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorValue_Color()
  {
    return (EAttribute)colorValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum gettimeUnit()
  {
    return timeUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTouchSensorSides()
  {
    return touchSensorSidesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getActions()
  {
    return actionsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDirections()
  {
    return directionsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColors()
  {
    return colorsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCompareOperator()
  {
    return compareOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslFactory getDslFactory()
  {
    return (DslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    missionEClass = createEClass(MISSION);
    createEReference(missionEClass, MISSION__TASKS);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__NAME);
    createEReference(taskEClass, TASK__SENSOR);
    createEAttribute(taskEClass, TASK__ACTION);
    createEAttribute(taskEClass, TASK__NR_OF_TIMES);
    createEReference(taskEClass, TASK__IGNORE_BEHAVIOR);
    createEAttribute(taskEClass, TASK__TIME);
    createEReference(taskEClass, TASK__TIMEUNIT);

    timeUnitValueEClass = createEClass(TIME_UNIT_VALUE);
    createEAttribute(timeUnitValueEClass, TIME_UNIT_VALUE__UNIT);

    ignorablesEClass = createEClass(IGNORABLES);
    createEAttribute(ignorablesEClass, IGNORABLES__AVOID_OBJECTS);

    sensorTypeEClass = createEClass(SENSOR_TYPE);

    colorSensorEClass = createEClass(COLOR_SENSOR);
    createEAttribute(colorSensorEClass, COLOR_SENSOR__DISTINCT);
    createEReference(colorSensorEClass, COLOR_SENSOR__KEY);
    createEReference(colorSensorEClass, COLOR_SENSOR__KEYS);

    touchSensorEClass = createEClass(TOUCH_SENSOR);
    createEAttribute(touchSensorEClass, TOUCH_SENSOR__KEY);

    ultrasonicSensorEClass = createEClass(ULTRASONIC_SENSOR);
    createEAttribute(ultrasonicSensorEClass, ULTRASONIC_SENSOR__COMPARATOR);
    createEAttribute(ultrasonicSensorEClass, ULTRASONIC_SENSOR__DISTANCE);

    colorValueEClass = createEClass(COLOR_VALUE);
    createEAttribute(colorValueEClass, COLOR_VALUE__COLOR);

    // Create enums
    timeUnitEEnum = createEEnum(TIME_UNIT);
    touchSensorSidesEEnum = createEEnum(TOUCH_SENSOR_SIDES);
    actionsEEnum = createEEnum(ACTIONS);
    directionsEEnum = createEEnum(DIRECTIONS);
    colorsEEnum = createEEnum(COLORS);
    compareOperatorEEnum = createEEnum(COMPARE_OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    colorSensorEClass.getESuperTypes().add(this.getSensorType());
    touchSensorEClass.getESuperTypes().add(this.getSensorType());
    ultrasonicSensorEClass.getESuperTypes().add(this.getSensorType());

    // Initialize classes and features; add operations and parameters
    initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMission_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Sensor(), this.getSensorType(), null, "sensor", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Action(), this.getActions(), "action", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_NrOfTimes(), ecorePackage.getEInt(), "nrOfTimes", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_IgnoreBehavior(), this.getIgnorables(), null, "ignoreBehavior", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Time(), ecorePackage.getEInt(), "time", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Timeunit(), this.gettimeUnitValue(), null, "timeunit", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeUnitValueEClass, timeUnitValue.class, "timeUnitValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(gettimeUnitValue_Unit(), this.gettimeUnit(), "unit", null, 0, 1, timeUnitValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ignorablesEClass, Ignorables.class, "Ignorables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIgnorables_AVOID_OBJECTS(), ecorePackage.getEString(), "AVOID_OBJECTS", null, 0, 1, Ignorables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorTypeEClass, SensorType.class, "SensorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(colorSensorEClass, ColorSensor.class, "ColorSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorSensor_Distinct(), ecorePackage.getEBoolean(), "distinct", null, 0, 1, ColorSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColorSensor_Key(), this.getColorValue(), null, "key", null, 0, 1, ColorSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColorSensor_Keys(), this.getColorValue(), null, "keys", null, 0, -1, ColorSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(touchSensorEClass, TouchSensor.class, "TouchSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTouchSensor_Key(), this.getTouchSensorSides(), "key", null, 0, 1, TouchSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ultrasonicSensorEClass, UltrasonicSensor.class, "UltrasonicSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUltrasonicSensor_Comparator(), this.getCompareOperator(), "comparator", null, 0, 1, UltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUltrasonicSensor_Distance(), ecorePackage.getEString(), "distance", null, 0, 1, UltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorValueEClass, ColorValue.class, "ColorValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorValue_Color(), this.getColors(), "color", null, 0, 1, ColorValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(timeUnitEEnum, timeUnit.class, "timeUnit");
    addEEnumLiteral(timeUnitEEnum, timeUnit.SECONDS);
    addEEnumLiteral(timeUnitEEnum, timeUnit.MILISECONDS);

    initEEnum(touchSensorSidesEEnum, TouchSensorSides.class, "TouchSensorSides");
    addEEnumLiteral(touchSensorSidesEEnum, TouchSensorSides.LEFT);
    addEEnumLiteral(touchSensorSidesEEnum, TouchSensorSides.RIGHT);
    addEEnumLiteral(touchSensorSidesEEnum, TouchSensorSides.BOTH);
    addEEnumLiteral(touchSensorSidesEEnum, TouchSensorSides.ANY);

    initEEnum(actionsEEnum, Actions.class, "Actions");
    addEEnumLiteral(actionsEEnum, Actions.ROTATE_L);
    addEEnumLiteral(actionsEEnum, Actions.ROTATE_R);
    addEEnumLiteral(actionsEEnum, Actions.DRIVE_FORWARD);
    addEEnumLiteral(actionsEEnum, Actions.DRIVE_BACKWARD);
    addEEnumLiteral(actionsEEnum, Actions.STOP_DRIVING);
    addEEnumLiteral(actionsEEnum, Actions.TURN_AROUND);
    addEEnumLiteral(actionsEEnum, Actions.BEEP);
    addEEnumLiteral(actionsEEnum, Actions.MEASURE);
    addEEnumLiteral(actionsEEnum, Actions.DRIVETOEDGE);

    initEEnum(directionsEEnum, Directions.class, "Directions");
    addEEnumLiteral(directionsEEnum, Directions.N);
    addEEnumLiteral(directionsEEnum, Directions.NE);
    addEEnumLiteral(directionsEEnum, Directions.E);
    addEEnumLiteral(directionsEEnum, Directions.SE);
    addEEnumLiteral(directionsEEnum, Directions.S);
    addEEnumLiteral(directionsEEnum, Directions.SW);
    addEEnumLiteral(directionsEEnum, Directions.W);
    addEEnumLiteral(directionsEEnum, Directions.NW);

    initEEnum(colorsEEnum, Colors.class, "Colors");
    addEEnumLiteral(colorsEEnum, Colors.BLACK);
    addEEnumLiteral(colorsEEnum, Colors.BLUE);
    addEEnumLiteral(colorsEEnum, Colors.CYAN);
    addEEnumLiteral(colorsEEnum, Colors.DARK_GRAY);
    addEEnumLiteral(colorsEEnum, Colors.GRAY);
    addEEnumLiteral(colorsEEnum, Colors.GREEN);
    addEEnumLiteral(colorsEEnum, Colors.LIGHT_GRAY);
    addEEnumLiteral(colorsEEnum, Colors.MAGENTA);
    addEEnumLiteral(colorsEEnum, Colors.ORANGE);
    addEEnumLiteral(colorsEEnum, Colors.PINK);
    addEEnumLiteral(colorsEEnum, Colors.RED);
    addEEnumLiteral(colorsEEnum, Colors.WHITE);
    addEEnumLiteral(colorsEEnum, Colors.YELLOW);

    initEEnum(compareOperatorEEnum, CompareOperator.class, "CompareOperator");
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.EQ);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.NEQ);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.GEQ);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.G);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.LEQ);
    addEEnumLiteral(compareOperatorEEnum, CompareOperator.L);

    // Create resource
    createResource(eNS_URI);
  }

} //DslPackageImpl

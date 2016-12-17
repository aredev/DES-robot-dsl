package rasman.robot.mars.des.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import rasman.robot.mars.des.dsl.Actions;
import rasman.robot.mars.des.dsl.ColorSensor;
import rasman.robot.mars.des.dsl.ColorValue;
import rasman.robot.mars.des.dsl.Colors;
import rasman.robot.mars.des.dsl.Ignorables;
import rasman.robot.mars.des.dsl.SensorType;
import rasman.robot.mars.des.dsl.Task;
import rasman.robot.mars.des.dsl.timeUnitValue;
import rasman.robot.mars.des.generator.ActionGenerator;
import rasman.robot.mars.des.generator.TimeOutGenerator;

@SuppressWarnings("all")
public class ColorBehaviorGenerator {
  public static CharSequence toBehaviorFile(final Task t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package behaviors;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import bluetooth.BluetoothConnector;");
    _builder.newLine();
    _builder.append("import lejos.robotics.Color;");
    _builder.newLine();
    _builder.append("import lejos.robotics.subsumption.Behavior;");
    _builder.newLine();
    _builder.append("import main.MasterRobot;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import helpers.*;");
    _builder.newLine();
    _builder.append("import lejos.hardware.Sound;");
    _builder.newLine();
    _builder.append("import lejos.robotics.Color;");
    _builder.newLine();
    _builder.append("import java.util.Timer;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* In this behavior we we first connect to the slave or wait for the connection from the master (depending on whether we are the master or the slave)");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* We take control if the sensored color is either blue, yellow mor red and if we have not encountered this color before. ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _name = t.getName();
    _builder.append(_name, "");
    _builder.append("Behavior implements Behavior{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private MasterRobot robot;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private float[] rgb;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private boolean suppressed = false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ArrayList<Integer> foundColors;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private int currentColor;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private int id; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*\tIndicates number of times the action has been performed.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private int actionCounter = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*\tMax number of times an action is allowed to run.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private int maxNrTime = ");
    int _nrOfTimes = t.getNrOfTimes();
    _builder.append(_nrOfTimes, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*\tBoolean to indicate whether times should be set");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    {
      timeUnitValue _timeunit = t.getTimeunit();
      boolean _equals = Objects.equal(_timeunit, null);
      if (_equals) {
        _builder.append("\t");
        _builder.append("private boolean setTimer = false;");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("private boolean setTimer = true;");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = t.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Behavior(MasterRobot r, int id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.robot = r;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("foundColors = new ArrayList<Integer>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.id = id;\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean takeControl() {\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (IgnoreBehaviors.currentTaskId != id){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (setTimer){");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _java = TimeOutGenerator.toJava(t);
    _builder.append(_java, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("setTimer = false;\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      int _nrOfTimes_1 = t.getNrOfTimes();
      boolean _greaterThan = (_nrOfTimes_1 > 0);
      if (_greaterThan) {
        _builder.append("\t\t");
        _builder.append("if (actionCounter >= maxNrTime){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("IgnoreBehaviors.withOnDistanceBehavior = true;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("IgnoreBehaviors.currentTaskId++;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("Sound.twoBeeps();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    {
      Ignorables _ignoreBehavior = t.getIgnoreBehavior();
      boolean _notEquals = (!Objects.equal(_ignoreBehavior, null));
      if (_notEquals) {
        _builder.append("\t\t");
        _builder.append("IgnoreBehaviors.withOnDistanceBehavior = false;");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    SensorType _sensor = t.getSensor();
    String _defineTakeControl = ColorBehaviorGenerator.defineTakeControl(((ColorSensor) _sensor));
    _builder.append(_defineTakeControl, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* We send the colorId of the detected color to the slave and add it to our own list. ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* If we have found all colors we send that we are done and stop driving. ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void action() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("suppressed = false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      SensorType _sensor_1 = t.getSensor();
      boolean _isDistinct = ((ColorSensor) _sensor_1).isDistinct();
      if (_isDistinct) {
        _builder.append("\t\t");
        _builder.append("if ( ! foundColors.contains(currentColor)){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("//The color has not been found before");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("foundColors.add(currentColor);");
        _builder.newLine();
        {
          EList<Actions> _action = t.getAction();
          for(final Actions act : _action) {
            _builder.append("\t\t");
            _builder.append("\t");
            String _generateCodeFromAction = ActionGenerator.generateCodeFromAction(act);
            _builder.append(_generateCodeFromAction, "\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.newLine();
        {
          EList<Actions> _action_1 = t.getAction();
          for(final Actions act_1 : _action_1) {
            _builder.append("\t\t");
            String _generateCodeFromAction_1 = ActionGenerator.generateCodeFromAction(act_1);
            _builder.append(_generateCodeFromAction_1, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    EList<Actions> _action_2 = t.getAction();
    String _yieldingThread = ActionGenerator.yieldingThread(_action_2);
    _builder.append(_yieldingThread, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("actionCounter++;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void suppress() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("suppressed = true;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static String defineTakeControl(final ColorSensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("currentColor = RGBColorWrapper.determineColor(robot.getColorSensorSample());");
    _builder.newLine();
    final String storeColor = _builder.toString();
    EList<ColorValue> _keys = sensor.getKeys();
    int _size = _keys.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("ArrayList<Integer> toFindColors = new ArrayList<Integer>();");
      _builder_1.newLine();
      {
        EList<ColorValue> _keys_1 = sensor.getKeys();
        for(final ColorValue color : _keys_1) {
          _builder_1.append("toFindColors.add(Color.");
          Colors _color = color.getColor();
          _builder_1.append(_color, "");
          _builder_1.append(");");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.newLine();
      {
        boolean _isDistinct = sensor.isDistinct();
        if (_isDistinct) {
          _builder_1.append("return (! foundColors.contains(currentColor) && toFindColors.contains(currentColor));");
          _builder_1.newLine();
        } else {
          _builder_1.append("return toFindColors.contains(currentColor);");
          _builder_1.newLine();
        }
      }
      return (storeColor + _builder_1);
    } else {
      ColorValue _key = sensor.getKey();
      boolean _notEquals = (!Objects.equal(_key, null));
      if (_notEquals) {
        boolean _isDistinct_1 = sensor.isDistinct();
        if (_isDistinct_1) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("return ( currentColor == Color.");
          ColorValue _key_1 = sensor.getKey();
          Colors _color_1 = _key_1.getColor();
          _builder_2.append(_color_1, "");
          _builder_2.append(" && !foundColors.contains(currentColor));");
          _builder_2.newLineIfNotEmpty();
          return (storeColor + _builder_2);
        } else {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("return currentColor == Color.");
          ColorValue _key_2 = sensor.getKey();
          Colors _color_2 = _key_2.getColor();
          _builder_3.append(_color_2, "");
          _builder_3.append(";");
          return (storeColor + _builder_3);
        }
      }
    }
    return null;
  }
}

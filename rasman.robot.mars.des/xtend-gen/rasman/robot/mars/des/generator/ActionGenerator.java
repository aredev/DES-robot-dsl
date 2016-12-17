package rasman.robot.mars.des.generator;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import rasman.robot.mars.des.dsl.Actions;

@SuppressWarnings("all")
public class ActionGenerator {
  public static String generateCodeFromAction(final Actions act) {
    if (act != null) {
      switch (act) {
        case BEEP:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("//Action: beep");
          _builder.newLine();
          _builder.newLine();
          _builder.append("Sound.buzz();");
          _builder.newLine();
          _builder.newLine();
          _builder.append("//End action");
          return _builder.toString();
        case DRIVE_BACKWARD:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("//Action: drive backward ");
          _builder_1.newLine();
          _builder_1.append("robot.getRightMotor().rotate(-180,true);");
          _builder_1.newLine();
          _builder_1.append("robot.getLeftMotor().rotate(-180, true);");
          _builder_1.newLine();
          _builder_1.newLine();
          _builder_1.append("//End action");
          _builder_1.newLine();
          _builder_1.newLine();
          return _builder_1.toString();
        case DRIVE_FORWARD:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("robot.getRightMotor().rotate(180,true);");
          _builder_2.newLine();
          _builder_2.append("robot.getLeftMotor().rotate(180, true);  ");
          _builder_2.newLine();
          return _builder_2.toString();
        case ROTATE_R:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("robot.getRightMotor().rotate(-180,true);");
          _builder_3.newLine();
          _builder_3.append("robot.getLeftMotor().rotate(180, true);");
          _builder_3.newLine();
          return _builder_3.toString();
        case ROTATE_L:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("robot.getRightMotor().rotate(180,true);");
          _builder_4.newLine();
          _builder_4.append("robot.getLeftMotor().rotate(-180, true);");
          _builder_4.newLine();
          return _builder_4.toString();
        case STOP_DRIVING:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("robot.getLeftMotor().stop();");
          _builder_5.newLine();
          _builder_5.append("robot.getRightMotor().stop();");
          _builder_5.newLine();
          return _builder_5.toString();
        case TURN_AROUND:
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("robot.getRightMotor().rotate(360,true);");
          _builder_6.newLine();
          _builder_6.append("robot.getLeftMotor().rotate(-360, true);");
          _builder_6.newLine();
          return _builder_6.toString();
        case DRIVETOEDGE:
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("robot.getLeftMotor().forward();");
          _builder_7.newLine();
          _builder_7.append("robot.getRightMotor().forward();");
          _builder_7.newLine();
          _builder_7.newLine();
          _builder_7.newLine();
          return _builder_7.toString();
        case MEASURE:
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("robot.putArmMotorDown();");
          _builder_8.newLine();
          _builder_8.append("robot.putArmMotorUp();");
          _builder_8.newLine();
          _builder_8.newLine();
          _builder_8.append("robot.getArmMotor().stop();");
          _builder_8.newLine();
          return _builder_8.toString();
        default:
          break;
      }
    }
    return null;
  }
  
  public static String yieldingThread(final List<Actions> actions) {
    for (final Actions act : actions) {
      boolean _equals = Objects.equal(act, Actions.DRIVETOEDGE);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("while(!suppressed && RGBColorWrapper.determineColor(robot.getColorSensorSample()) != Color.WHITE  ){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("Thread.yield();");
        _builder.newLine();
        _builder.append("}");
        return _builder.toString();
      } else {
        if ((((!Objects.equal(act, Actions.BEEP)) && (!Objects.equal(act, Actions.STOP_DRIVING))) && (!Objects.equal(act, Actions.MEASURE)))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("while(!suppressed && robot.getLeftMotor().isMoving()){");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("Thread.yield();");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
          return _builder_1.toString();
        }
      }
    }
    return null;
  }
}

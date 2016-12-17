package rasman.robot.mars.des.generator;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import rasman.robot.mars.des.dsl.Task;
import rasman.robot.mars.des.dsl.timeUnit;
import rasman.robot.mars.des.dsl.timeUnitValue;

@SuppressWarnings("all")
public class TimeOutGenerator {
  public static String toJava(final Task t) {
    StringConcatenation _builder = new StringConcatenation();
    String timerCode = _builder.toString();
    timeUnitValue _timeunit = t.getTimeunit();
    boolean _notEquals = (!Objects.equal(_timeunit, null));
    if (_notEquals) {
      String _timerCode = timerCode;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Timer timeOutTask = new Timer();");
      _builder_1.newLine();
      timerCode = (_timerCode + _builder_1);
      timeUnitValue _timeunit_1 = t.getTimeunit();
      timeUnit _unit = _timeunit_1.getUnit();
      boolean _equals = Objects.equal(_unit, timeUnit.SECONDS);
      if (_equals) {
        String _timerCode_1 = timerCode;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("timeOutTask.schedule(new IncrementIdOnTimeOutTask(), ");
        int _time = t.getTime();
        int _multiply = (_time * 1000);
        _builder_2.append(_multiply, "");
        _builder_2.append(");");
        _builder_2.newLineIfNotEmpty();
        timerCode = (_timerCode_1 + _builder_2);
      } else {
        String _timerCode_2 = timerCode;
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("timeOutTask.schedule(new IncrementIdOnTimeOutTask(), ");
        int _time_1 = t.getTime();
        _builder_3.append(_time_1, "");
        _builder_3.append(");");
        _builder_3.newLineIfNotEmpty();
        timerCode = (_timerCode_2 + _builder_3);
      }
    }
    return timerCode;
  }
}

package at.ac.tuwien.big.scml.codegen.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;
import scml.KPIMeasurementDevice;

@SuppressWarnings("all")
public class KPIMeasurementDeviceGenerator {
  public static final String ENV_PACKAGE = "kpi";

  public CharSequence generate(final String packageName, final KPIMeasurementDevice kpi) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# TODO: Implement");
    _builder.newLine();
    return _builder;
  }
}

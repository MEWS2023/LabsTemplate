package at.ac.tuwien.big.scml.codegen.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;
import scml.DataValue;

@SuppressWarnings("all")
public class DataValueGenerator {
  public static final String ENV_PACKAGE = "value";

  public CharSequence generate(final String packageName, final DataValue datavalue) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# TODO: Implement");
    _builder.newLine();
    return _builder;
  }
}

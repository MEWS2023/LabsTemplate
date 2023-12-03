package at.ac.tuwien.big.scml.codegen.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;
import scml.Parameter;

@SuppressWarnings("all")
public class ParameterGenerator {
  public static final String ENV_PACKAGE = "parameter";

  public CharSequence generate(final String packageName, final Parameter param) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# TODO: Implement");
    _builder.newLine();
    return _builder;
  }
}

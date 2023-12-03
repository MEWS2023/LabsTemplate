package at.ac.tuwien.big.scml.codegen.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;
import scml.InfrastructureComponent;

@SuppressWarnings("all")
public class InfrastructureComponentGenerator {
  public static final String ENV_PACKAGE = "infrastructure";

  public CharSequence generate(final String packageName, final InfrastructureComponent comp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# TODO: Implement");
    _builder.newLine();
    return _builder;
  }
}

package at.ac.tuwien.big.scml.codegen.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;
import scml.Project;

@SuppressWarnings("all")
public class ProjectGenerator {
  public static final String ENV_PACKAGE = "project";

  public CharSequence generate(final String packageName, final Project node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# TODO: ImplementProject");
    _builder.newLine();
    return _builder;
  }
}

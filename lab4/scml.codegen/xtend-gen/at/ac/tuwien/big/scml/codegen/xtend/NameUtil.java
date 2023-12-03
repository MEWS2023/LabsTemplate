package at.ac.tuwien.big.scml.codegen.xtend;

@SuppressWarnings("all")
public class NameUtil {
  /**
   * Returns whitespaces.
   */
  public static String ws(final String str) {
    return str.replace(" ", "").replace("-", "_");
  }

  /**
   * Creates a camelcase variableName
   */
  public static String toVar(final String str) {
    final String name = NameUtil.ws(str);
    String _lowerCase = Character.valueOf(name.charAt(0)).toString().toLowerCase();
    String _substring = name.substring(1);
    return (_lowerCase + _substring);
  }

  /**
   * Creates the class name.
   */
  public static String toClass(final String str) {
    final String name = NameUtil.ws(str);
    String _upperCase = Character.valueOf(name.charAt(0)).toString().toUpperCase();
    String _substring = name.substring(1);
    return (_upperCase + _substring);
  }

  /**
   * Creates the package name.
   */
  public static String toPack(final String str) {
    return str.replace(" ", "").replace("-", "_").toLowerCase();
  }
}

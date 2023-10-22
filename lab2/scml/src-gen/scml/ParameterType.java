/**
 */
package scml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see scml.ScmlPackage#getParameterType()
 * @model
 * @generated
 */
public enum ParameterType implements Enumerator {
	/**
	 * The '<em><b>AIRQUALITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRQUALITY_VALUE
	 * @generated
	 * @ordered
	 */
	AIRQUALITY(0, "AIRQUALITY", "AIRQUALITY"),

	/**
	 * The '<em><b>WEATHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEATHER_VALUE
	 * @generated
	 * @ordered
	 */
	WEATHER(1, "WEATHER", "WEATHER"),

	/**
	 * The '<em><b>TRAFFIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC_VALUE
	 * @generated
	 * @ordered
	 */
	TRAFFIC(2, "TRAFFIC", "TRAFFIC"),

	/**
	 * The '<em><b>ENERGY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY(3, "ENERGY", "ENERGY"),

	/**
	 * The '<em><b>AGRICULTURAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGRICULTURAL_VALUE
	 * @generated
	 * @ordered
	 */
	AGRICULTURAL(4, "AGRICULTURAL", "AGRICULTURAL"),

	/**
	 * The '<em><b>NAVIGATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATION(5, "NAVIGATION", "NAVIGATION"),

	/**
	 * The '<em><b>WASTEMANAGEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASTEMANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	WASTEMANAGEMENT(6, "WASTEMANAGEMENT", "WASTEMANAGEMENT"),

	/**
	 * The '<em><b>SAFETY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY(7, "SAFETY", "SAFETY");

	/**
	 * The '<em><b>AIRQUALITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRQUALITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AIRQUALITY_VALUE = 0;

	/**
	 * The '<em><b>WEATHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEATHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEATHER_VALUE = 1;

	/**
	 * The '<em><b>TRAFFIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAFFIC_VALUE = 2;

	/**
	 * The '<em><b>ENERGY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_VALUE = 3;

	/**
	 * The '<em><b>AGRICULTURAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGRICULTURAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGRICULTURAL_VALUE = 4;

	/**
	 * The '<em><b>NAVIGATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAVIGATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATION_VALUE = 5;

	/**
	 * The '<em><b>WASTEMANAGEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASTEMANAGEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WASTEMANAGEMENT_VALUE = 6;

	/**
	 * The '<em><b>SAFETY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_VALUE = 7;

	/**
	 * An array of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterType[] VALUES_ARRAY = new ParameterType[] { AIRQUALITY, WEATHER, TRAFFIC, ENERGY,
			AGRICULTURAL, NAVIGATION, WASTEMANAGEMENT, SAFETY, };

	/**
	 * A public read-only list of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParameterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterType get(int value) {
		switch (value) {
		case AIRQUALITY_VALUE:
			return AIRQUALITY;
		case WEATHER_VALUE:
			return WEATHER;
		case TRAFFIC_VALUE:
			return TRAFFIC;
		case ENERGY_VALUE:
			return ENERGY;
		case AGRICULTURAL_VALUE:
			return AGRICULTURAL;
		case NAVIGATION_VALUE:
			return NAVIGATION;
		case WASTEMANAGEMENT_VALUE:
			return WASTEMANAGEMENT;
		case SAFETY_VALUE:
			return SAFETY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ParameterType

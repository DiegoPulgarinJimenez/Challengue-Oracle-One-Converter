package converter_Model;

public class ConverterCurrency {

	String valueToConvert;
	
	/**
	 * Constructor. Receives a string value that represent a currency value. 
	 */
	public ConverterCurrency(String valueToConvert) {
		this.valueToConvert = valueToConvert;
	}
	
	/**
	 * Return the currency value entered casted to a Double value.
	 */
	public double equalCurrency() {
		return Double.valueOf(valueToConvert);
	}
	
	/**
	 * Return COP TO USD casted to a Double value. 
	 */
	public double copToUsd() {
		return Double.valueOf(valueToConvert) * 0.00025;
	}
	
	/**
	 * Return COP TO EURO casted to a Double value. 
	 */
	public double copToEuros() {
		return Double.valueOf(valueToConvert) * 0.00022;
	}
	
	/**
	 * Return COP TO POUNDS casted to a Double value. 
	 */
	public double copToPounds() {
		return Double.valueOf(valueToConvert) * 0.00019;
	}
	
	/**
	 * Return COP TO YEN casted to a Double value. 
	 */
	public double copToYen() {
		return Double.valueOf(valueToConvert) * 0.034;
	}
	
	/**
	 * Return COP TO WON casted to a Double value. 
	 */
	public double copToWon() {
		return Double.valueOf(valueToConvert) * 0.31;
	}
	
	/**
	 * Return USD TO COP casted to a Double value. 
	 */
	public double usdToCop() {
		return Double.valueOf(valueToConvert) * 4105.72;
	}
	
	/**
	 * Return USD TO EUROS casted to a Double value. 
	 */
	public double usdToEuros() {
		return Double.valueOf(valueToConvert) * 0.91;
	}
	
	/**
	 * Return USD TO POUNDS casted to a Double value. 
	 */
	public double usdToPounds() {
		return Double.valueOf(valueToConvert) * 0.78;
	}
	
	/**
	 * Return USD TO YEN casted to a Double value. 
	 */
	public double usdToYen() {
		return Double.valueOf(valueToConvert) * 141.84;
	}
	
	/**
	 * Return USD TO WON casted to a Double value. 
	 */
	public double usdToWon() {
		return Double.valueOf(valueToConvert) * 1300.64;
	}
	
	/**
	 * Return EURO TO COP casted to a Double value. 
	 */
	public double euroToCop() {
		return Double.valueOf(valueToConvert) * 4525.73;
	}
	
	/**
	 * Return EURO TO USD casted to a Double value. 
	 */
	public double euroToUsd() {
		return Double.valueOf(valueToConvert) * 1.10;
	}
	
	/**
	 * Return EURO TO POUNDS casted to a Double value. 
	 */
	public double euroToPounds() {
		return Double.valueOf(valueToConvert) * 0.86;
	}
	
	/**
	 * Return EURO TO YEN casted to a Double value. 
	 */
	public double euroToYen() {
		return Double.valueOf(valueToConvert) * 156.52;
	}
	
	/**
	 * Return EURO TO WON casted to a Double value. 
	 */
	public double euroToWon() {
		return Double.valueOf(valueToConvert) * 1435.53;
	}
	
	/**
	 * Return POUNDS TO COP casted to a Double value. 
	 */
	public double poundsToCop() {
		return Double.valueOf(valueToConvert) * 5241.77;
	}
	/**
	 * Return POUNDS TO USD casted to a Double value. 
	 */
	public double poundsToUsd() {
		return Double.valueOf(valueToConvert) * 1.28;
	}
	
	/**
	 * Return POUNDS TO EURO casted to a Double value. 
	 */
	public double poundsToEuro() {
		return Double.valueOf(valueToConvert) * 1.16;
	}
	
	/**
	 * Return POUNDS TO YEN casted to a Double value. 
	 */
	public double poundsToYen() {
		return Double.valueOf(valueToConvert) * 181.35;
	}
	/**
	 * Return POUNDS TO WON casted to a Double value. 
	 */
	public double poundsToWon() {
		return Double.valueOf(valueToConvert) * 1663.33;
	}
	
	/**
	 * Return YEN TO COP casted to a Double value. 
	 */
	public double yenToCop() {
		return Double.valueOf(valueToConvert) * 28.89;
	}
	
	/**
	 * Return YEN TO USD casted to a Double value. 
	 */
	public double yenToUsd() {
		return Double.valueOf(valueToConvert) * 0.0071;
	}
	
	/**
	 * Return YEN TO EURO casted to a Double value. 
	 */
	public double yenToEuro() {
		return Double.valueOf(valueToConvert) * 0.0064;
	}
	
	/**
	 * Return YEN TO POUNDS casted to a Double value. 
	 */
	public double yenToPounds() {
		return Double.valueOf(valueToConvert) * 0.0055;
	}
	
	/**
	 * Return YEN TO WON casted to a Double value. 
	 */
	public double yenToWon() {
		return Double.valueOf(valueToConvert) * 9.17;
	}
	
	/**
	 * Return WON TO COP casted to a Double value. 
	 */
	public double wonToCop() {
		return Double.valueOf(valueToConvert) * 3.15;
	}
	
	/**
	 * Return WON TO USD casted to a Double value. 
	 */
	public double wonToUsd() {
		return Double.valueOf(valueToConvert) * 0.00077;
	}
	
	/**
	 * Return WON TO EURO casted to a Double value. 
	 */
	public double wonToEuro() {
		return Double.valueOf(valueToConvert) * 0.00070;
	}
	
	/**
	 * Return WON TO POUNDS casted to a Double value. 
	 */
	public double wonToPounds() {
		return Double.valueOf(valueToConvert) * 0.00060;
	}
	
	/**
	 * Return WON TO YEN casted to a Double value. 
	 */
	public double wonToYen() {
		return Double.valueOf(valueToConvert) * 0.11;
	}
}
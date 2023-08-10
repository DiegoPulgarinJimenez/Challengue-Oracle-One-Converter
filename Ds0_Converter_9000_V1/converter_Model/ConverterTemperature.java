package converter_Model;

public class ConverterTemperature {
	
	String temperatureToConvert;
	
	/**
	 * Constructor. Receives a string value that represent a temperature value. 
	 */
	public ConverterTemperature(String temperatureToConvert) {
		this.temperatureToConvert = temperatureToConvert;
	}
	
	/**
	 * Return the temperature value entered casted to a Double value.
	 */
	public double equalTemperature() {
		return Double.valueOf(temperatureToConvert);
	}
	
	/**
	 * Return the temperature from Celsius to Kelvin casted to a Double value.
	 */
	public double celsiusToKelvin() {
		return (Double.valueOf(temperatureToConvert) + 273.15);
	}
	
	/**
	 * Return the temperature from Celsius to Fahrenheit casted to a Double value.
	 */
	public double celsiusToFahrenheit() {
		return (Double.valueOf(temperatureToConvert) * 1.8) + 32;
	}
	
	/**
	 * Return the temperature from Kelvin to Celcius casted to a Double value.
	 */
	public double kelvinToCelsius() {
		return (Double.valueOf(temperatureToConvert) - 273.15);
	}
	
	/**
	 * Return the temperature from Kelvin to Fahrenheit casted to a Double value.
	 */
	public double kelvinToFahrenheit() {
		return (Double.valueOf(temperatureToConvert) - 273.15) * 33.8;
	}
	
	/**
	 * Return the temperature from Fahrenheit to Celcius casted to a Double value.
	 */
	public double fahrenheitToCelsius() {
		return (Double.valueOf(temperatureToConvert) - 32) * 1.8;
	}
	
	/**
	 * Return the temperature from Fahrenheit to Kelvin casted to a Double value.
	 */
	public double fahrenheitToKelvin() {
		return (Double.valueOf(temperatureToConvert) - 32) * 274.95;
	}
}

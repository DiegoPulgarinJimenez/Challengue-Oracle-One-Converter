package converter_Model;

import java.awt.Dimension;
import java.awt.Toolkit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;

public class ConverterMainLaunch {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text ammountToConvert;
	private Text ammountConverted;
	private Text temperatureToConvert;
	private Text temperatureConverted;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ConverterMainLaunch window = new ConverterMainLaunch();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) screenSize.getWidth();
		int y = (int) screenSize.getHeight();

		/**
		 * Main Window.
		 */
		shell = new Shell();
		shell.setImage(SWTResourceManager.getImage(ConverterMainLaunch.class, "/org/currencies.png"));
		shell.setBackground(null);
		shell.setMinimumSize(new Point(799, 600));
		shell.setModified(true);
		shell.setMaximumSize(new Point(799, 600));
		shell.setSize(945, 679);
		shell.setLocation((x - 400) / 2, (y - 400) / 2);
		shell.setText("DS0'S Converter");
		shell.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		
		/**
		 * Frames, labels, buttons, text boxes.
		 */

		Composite temperatureConverterFrame = new Composite(shell, SWT.BORDER);
		temperatureConverterFrame.setBounds(4, 279, 774, 269);
		formToolkit.adapt(temperatureConverterFrame);
		formToolkit.paintBordersFor(temperatureConverterFrame);

		Label lblSelectInitialTemperature = new Label(temperatureConverterFrame, SWT.NONE);
		lblSelectInitialTemperature.setText("Select The Initial Temperature");
		lblSelectInitialTemperature.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblSelectInitialTemperature.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblSelectInitialTemperature.setBounds(48, 45, 208, 20);
		formToolkit.adapt(lblSelectInitialTemperature, true, true);

		Label lblEnterTemperatureAmount = new Label(temperatureConverterFrame, SWT.NONE);
		lblEnterTemperatureAmount.setText("Enter Temperature");
		lblEnterTemperatureAmount.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblEnterTemperatureAmount.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		lblEnterTemperatureAmount.setBounds(294, 45, 133, 20);
		formToolkit.adapt(lblEnterTemperatureAmount, true, true);

		Label lblSelectFinalTemperature = new Label(temperatureConverterFrame, SWT.NONE);
		lblSelectFinalTemperature.setText("Select The Final Temperature");
		lblSelectFinalTemperature.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblSelectFinalTemperature.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		lblSelectFinalTemperature.setBounds(48, 124, 206, 20);
		formToolkit.adapt(lblSelectFinalTemperature, true, true);

		Label lblFinalTemperature = new Label(temperatureConverterFrame, SWT.NONE);
		lblFinalTemperature.setText("Final Temperature");
		lblFinalTemperature.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblFinalTemperature.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblFinalTemperature.setBounds(490, 45, 127, 20);
		formToolkit.adapt(lblFinalTemperature, true, true);

		Label temperatureConverterTittle = new Label(temperatureConverterFrame, SWT.NONE);
		temperatureConverterTittle.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		temperatureConverterTittle.setAlignment(SWT.CENTER);
		temperatureConverterTittle.setText("Temperature Converter");
		temperatureConverterTittle.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		temperatureConverterTittle.setBounds(300, 10, 181, 20);
		formToolkit.adapt(temperatureConverterTittle, true, true);

		Combo selecterInitialTemperature = new Combo(temperatureConverterFrame, SWT.NONE);
		selecterInitialTemperature.setItems(new String[] { "CELSIUS (CENTIGRADES)", "FAHRENHEIT", "KELVIN" });
		selecterInitialTemperature.setBounds(70, 80, 158, 28);
		formToolkit.adapt(selecterInitialTemperature);
		formToolkit.paintBordersFor(selecterInitialTemperature);
		selecterInitialTemperature.setText("Initial Temperature");

		Combo selecterFinalTemperature = new Combo(temperatureConverterFrame, SWT.NONE);
		selecterFinalTemperature.setItems(new String[] { "CELSIUS (CENTIGRADES)", "FAHRENHEIT", "KELVIN" });
		selecterFinalTemperature.setBounds(70, 163, 158, 28);
		formToolkit.adapt(selecterFinalTemperature);
		formToolkit.paintBordersFor(selecterFinalTemperature);
		selecterFinalTemperature.setText("Final Temperature");

		temperatureToConvert = new Text(temperatureConverterFrame, SWT.BORDER);
		temperatureToConvert.setText("0°");
		temperatureToConvert.setBounds(294, 80, 149, 26);
		formToolkit.adapt(temperatureToConvert, true, true);

		temperatureConverted = new Text(temperatureConverterFrame, SWT.BORDER);
		temperatureConverted.setText("0°");
		temperatureConverted.setBounds(490, 80, 149, 26);
		formToolkit.adapt(temperatureConverted, true, true);
		
		Label labelWarningTemperature = new Label(temperatureConverterFrame, SWT.NONE);
		labelWarningTemperature.setBounds(40, 224, 680, 20);
		formToolkit.adapt(labelWarningTemperature, true, true);

		Composite currencyConverterFrame = new Composite(shell, SWT.BORDER);
		currencyConverterFrame.setBackground(SWTResourceManager.getColor(255, 255, 255));
		currencyConverterFrame.setBounds(4, 4, 774, 269);
		currencyConverterFrame.setLayout(null);

		Label lblSelectInitialCurrency = new Label(currencyConverterFrame, SWT.NONE);
		lblSelectInitialCurrency.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblSelectInitialCurrency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblSelectInitialCurrency.setBounds(48, 45, 181, 20);
		lblSelectInitialCurrency.setText("Select The Initial Currency");

		Label lblEnterCurrencyAmount = new Label(currencyConverterFrame, SWT.NONE);
		lblEnterCurrencyAmount.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		lblEnterCurrencyAmount.setText("Enter Amount");
		lblEnterCurrencyAmount.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblEnterCurrencyAmount.setBounds(294, 45, 111, 20);
		formToolkit.adapt(lblEnterCurrencyAmount, true, true);

		Label lblSelectTheFinalCurrency = new Label(currencyConverterFrame, SWT.NONE);
		lblSelectTheFinalCurrency.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		lblSelectTheFinalCurrency.setText("Select The Final Currency");
		lblSelectTheFinalCurrency.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblSelectTheFinalCurrency.setBounds(48, 128, 181, 20);
		formToolkit.adapt(lblSelectTheFinalCurrency, true, true);

		Label lblFinalAmount = new Label(currencyConverterFrame, SWT.NONE);
		lblFinalAmount.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblFinalAmount.setText("Final Amount");
		lblFinalAmount.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		lblFinalAmount.setBounds(490, 45, 111, 20);
		formToolkit.adapt(lblFinalAmount, true, true);

		Label curencyConverterTittle = new Label(currencyConverterFrame, SWT.NONE);
		curencyConverterTittle.setAlignment(SWT.CENTER);
		curencyConverterTittle.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		curencyConverterTittle.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		curencyConverterTittle.setBounds(300, 10, 181, 20);
		formToolkit.adapt(curencyConverterTittle, true, true);
		curencyConverterTittle.setText("Currency Converter");
		
		Label labelWarningCurrency = new Label(currencyConverterFrame, SWT.NONE);
		labelWarningCurrency.setBounds(40, 210, 680, 20);
		formToolkit.adapt(labelWarningCurrency, true, true);

		Combo selecterInitialCurrency = new Combo(currencyConverterFrame, SWT.NONE);
		selecterInitialCurrency.setItems(new String[] { "COP", "USD", "EURO", "POUNDS", "YEN", "WON" });
		selecterInitialCurrency.setBounds(70, 80, 133, 28);
		formToolkit.adapt(selecterInitialCurrency);
		formToolkit.paintBordersFor(selecterInitialCurrency);
		selecterInitialCurrency.setText("Initial Currency");

		Combo selecterFinalCurrency = new Combo(currencyConverterFrame, SWT.NONE);
		selecterFinalCurrency.setItems(new String[] { "COP", "USD", "EURO", "POUNDS", "YEN", "WON" });
		selecterFinalCurrency.setBounds(70, 158, 133, 28);
		formToolkit.adapt(selecterFinalCurrency);
		formToolkit.paintBordersFor(selecterFinalCurrency);
		selecterFinalCurrency.setText("Final Currency");
		
		/**
		 * Event to convert currencies. 
		 */
		Button btnConvertCurrency = new Button(currencyConverterFrame, SWT.NONE);
		btnConvertCurrency.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
				try {
					
					String initialCurrency = selecterInitialCurrency.getText();
					String finalCurrency = selecterFinalCurrency.getText();

					ConverterCurrency currencyConverterObject = new ConverterCurrency(ammountToConvert.getText());
					/**
					 * Equal Currencies.
					 */
					if (initialCurrency.equals(finalCurrency)) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.equalCurrency())) + " " + finalCurrency);
						labelWarningCurrency.setText("");
					}
					/**
					 * COP TO USD, EURO, POUNDS, YEN, WON Currencies.
					 */
					else if ((initialCurrency.equals("COP")) && (finalCurrency.equals("USD"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.copToUsd())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("COP")) && (finalCurrency.equals("EURO"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.copToEuros())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("COP")) && (finalCurrency.equals("POUNDS"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.copToPounds())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("COP")) && (finalCurrency.equals("YEN"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.copToYen())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("COP")) && (finalCurrency.equals("WON"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.copToWon())) + " " + finalCurrency);
					}
					/**
					 * USD TO COP, EURO, POUNDS, YEN, WON Currencies.
					 */
					else if ((initialCurrency.equals("USD")) && (finalCurrency.equals("COP"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.usdToCop())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("USD")) && (finalCurrency.equals("EURO"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.usdToEuros())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("USD")) && (finalCurrency.equals("POUNDS"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.usdToPounds())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("USD")) && (finalCurrency.equals("YEN"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.usdToYen())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("USD")) && (finalCurrency.equals("WON"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.usdToWon())) + " " + finalCurrency);
					}
					/**
					 * EURO TO COP, USD, POUNDS, YEN, WON Currencies.
					 */
					else if ((initialCurrency.equals("EURO")) && (finalCurrency.equals("COP"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.euroToCop())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("EURO")) && (finalCurrency.equals("USD"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.euroToUsd())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("EURO")) && (finalCurrency.equals("POUNDS"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.euroToPounds())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("EURO")) && (finalCurrency.equals("YEN"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.euroToYen())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("EURO")) && (finalCurrency.equals("WON"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.euroToWon())) + " " + finalCurrency);
					}
					/**
					 * POUNDS TO COP, USD, EURO, YEN, WON Currencies.
					 */
					else if ((initialCurrency.equals("POUNDS")) && (finalCurrency.equals("COP"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.poundsToCop())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("POUNDS")) && (finalCurrency.equals("USD"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.poundsToUsd())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("POUNDS")) && (finalCurrency.equals("EURO"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.poundsToEuro())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("POUNDS")) && (finalCurrency.equals("YEN"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.poundsToYen())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("POUNDS")) && (finalCurrency.equals("WON"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.poundsToWon())) + " " + finalCurrency);
					}
					/**
					 * YEN TO COP, USD, EURO, POUNDS, WON Currencies.
					 */
					else if ((initialCurrency.equals("YEN")) && (finalCurrency.equals("COP"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.yenToCop())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("YEN")) && (finalCurrency.equals("USD"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.yenToUsd())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("YEN")) && (finalCurrency.equals("EURO"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.yenToEuro())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("YEN")) && (finalCurrency.equals("POUNDS"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.yenToPounds())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("YEN")) && (finalCurrency.equals("WON"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.yenToWon())) + " " + finalCurrency);
					}
					/**
					 * WON TO COP, USD, EURO, POUNDS, YEN Currencies.
					 */
					else if ((initialCurrency.equals("WON")) && (finalCurrency.equals("COP"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.wonToCop())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("WON")) && (finalCurrency.equals("USD"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.wonToUsd())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("WON")) && (finalCurrency.equals("EURO"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.wonToEuro())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("WON")) && (finalCurrency.equals("POUNDS"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.wonToPounds())) + " " + finalCurrency);
					} else if ((initialCurrency.equals("WON")) && (finalCurrency.equals("YEN"))) {
						ammountConverted.setText(String.format("%,.2f", Double.valueOf(currencyConverterObject.wonToYen())) + " " + finalCurrency);
					}
				} 
				
				/**
				 * To handle the NumberFormatException caused due to user entering text instead numbers that represents currency values.  
				 */
				catch (NumberFormatException noNumberCurrency) {
					noNumberCurrency.printStackTrace();
					labelWarningCurrency.setText("Please use numbers only. If you want to add a decimal value please use one and only one dot (.)");
					labelWarningCurrency.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));					
					ammountConverted.setText("0.0");
				} 			
			}
		});
		btnConvertCurrency.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		btnConvertCurrency.setBounds(409, 128, 124, 49);
		formToolkit.adapt(btnConvertCurrency, true, true);
		btnConvertCurrency.setText("Convert");

		ammountToConvert = new Text(currencyConverterFrame, SWT.BORDER);

		ammountToConvert.setText("0.0");
		ammountToConvert.setBounds(294, 80, 149, 26);
		formToolkit.adapt(ammountToConvert, true, true);

		ammountConverted = new Text(currencyConverterFrame, SWT.BORDER);
		ammountConverted.setText("0.0");
		ammountConverted.setBounds(490, 80, 149, 26);
		formToolkit.adapt(ammountConverted, true, true);
		
		/**
		 * Event to convert temperatures. 
		 */
		Button btnConvertTemperature = new Button(temperatureConverterFrame, SWT.NONE);
		btnConvertTemperature.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
				try {
					
					String initialTemperature = selecterInitialTemperature.getText();
					String finalTemperature = selecterFinalTemperature.getText();
					
					ConverterTemperature temperatureConverterObject = new ConverterTemperature(temperatureToConvert.getText());
					
					/**
					 * Equal temperatures. 
					 */
					if (initialTemperature.equals(finalTemperature)) {
						temperatureConverted.setText(String.format("%,.0f", Double.valueOf(temperatureConverterObject.equalTemperature())) + "° " + finalTemperature);
						labelWarningCurrency.setText("");
					} 
					
					/**
					 * Celsius(Centigrade) to Kelvin and to Fahrenheit.
					 */
					else if ((initialTemperature.equals("CELSIUS (CENTIGRADES)")) && (finalTemperature.equals("KELVIN"))) {
						temperatureConverted.setText(String.format("%,.0f", Double.valueOf(temperatureConverterObject.celsiusToKelvin())) + "° " + finalTemperature);
						labelWarningCurrency.setText("");
					} else if ((initialTemperature.equals("CELSIUS (CENTIGRADES)")) && (finalTemperature.equals("FAHRENHEIT"))) {
						temperatureConverted.setText(String.format("%,.0f", Double.valueOf(temperatureConverterObject.celsiusToFahrenheit())) + "° " + finalTemperature);
						labelWarningCurrency.setText("");
					} 
					
					/**
					 * Kelvin to Celsius(Centigrade) and to Fahrenheit.
					 */
					else if ((initialTemperature.equals("KELVIN")) && (finalTemperature.equals("CELSIUS (CENTIGRADES)"))) {
						temperatureConverted.setText(String.format("%,.0f", Double.valueOf(temperatureConverterObject.kelvinToCelsius())) + "° " + finalTemperature);
						labelWarningCurrency.setText("");
					} else if ((initialTemperature.equals("KELVIN")) && (finalTemperature.equals("FAHRENHEIT"))) {
						temperatureConverted.setText(String.format("%,.0f", Double.valueOf(temperatureConverterObject.kelvinToFahrenheit())) + "° " + finalTemperature);
						labelWarningCurrency.setText("");
					}
					
					/**
					 * Fahrenheit to Celsius(Centigrade) and to Kelvin.
					 */
					else if ((initialTemperature.equals("FAHRENHEIT")) && (finalTemperature.equals("CELSIUS (CENTIGRADES)"))) {
						temperatureConverted.setText(String.format("%,.0f", Double.valueOf(temperatureConverterObject.fahrenheitToCelsius())) + "° " + finalTemperature);
						labelWarningCurrency.setText("");
					} else if ((initialTemperature.equals("FAHRENHEIT")) && (finalTemperature.equals("KELVIN"))) {
						temperatureConverted.setText(String.format("%,.0f", Double.valueOf(temperatureConverterObject.fahrenheitToKelvin())) + "° " + finalTemperature);
						labelWarningCurrency.setText("");
					}
				}
				
				/**
				 * To handle the NumberFormatException caused due to user entering text instead numbers that represents temperature values.  
				 */
				catch (NumberFormatException noNumberTemperature) {
					noNumberTemperature.printStackTrace(); 
					labelWarningTemperature.setText("Please use numbers only. If you want to add a decimal value please use one and only one dot (.)");
					labelWarningTemperature.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));					
					temperatureConverted.setText("0");
				}
			}
		});
		btnConvertTemperature.setText("Convert");
		btnConvertTemperature.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		btnConvertTemperature.setBounds(410, 124, 124, 49);
		formToolkit.adapt(btnConvertTemperature, true, true);
	}
}

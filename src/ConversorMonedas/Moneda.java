package ConversorMonedas;
import javax.swing.JOptionPane;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Dictionary;
import java.util.Hashtable;

public class Moneda {
	private double valorMoneda;
	//private String tipoMoneda;
	//private String tipoMonedaConvertir;
	private Dictionary<String, Double> factoresConversion = new Hashtable<>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		// Los factores de conversión están en base a pesos chilenos
		put("dolares", Double.valueOf(905.48));
		put("euros", Double.valueOf(919.29));
		put("libras", Double.valueOf(1050.49));
		put("yenes", Double.valueOf(6.35));
		put("wons coreanos", Double.valueOf(0.66));
		
	}};
	
	public Moneda(){
		this.valorMoneda = 0;
	}
	
	// método que recibe input del usuario de la cantidad de dinero
	public void inputMoneda() {
		double input = 0;
		boolean isValid = false; // indicador que servirá para indicar si el valor es válido
		while(!isValid) {
			try {
				input = Double.parseDouble(JOptionPane.showInputDialog(null, 
						"Ingresa la cantidad de dinero que deseas convertir", "Input Moneda",
						JOptionPane.INFORMATION_MESSAGE));
						
				if(input <= 0) {
					throw new NumberFormatException() ;
				}
						
				isValid = true;
			} catch (NumberFormatException exp){
				JOptionPane.showMessageDialog(null, "Ingresa una cantidad válida");
			}
		}
		this.valorMoneda = input;
	}
	
	public void showMoneda(double valor, String nombreMoneda) {
		JOptionPane.showMessageDialog(null, "Posees " + valor + " " + nombreMoneda + " aproximadamente.");
	}
	


	/* Método que realiza la conversión de monedas teniendo como referencia los factores de conversión 
	 * y despliega el resultado por pantalla*/
	public void convertirMoneda(String moneda, String monedaConvertir) {
		double monedaConvertida = 0.0;
		double factor = 0.0;
		if (moneda == "pesos chilenos") {
			// se quiere convertir de pesos chilenos a x moneda
			factor = this.factoresConversion.get(monedaConvertir).doubleValue();
			monedaConvertida = this.valorMoneda / factor;
		} else {
			// se quiere convertir x moneda a pesos chilenos
			factor = this.factoresConversion.get(moneda).doubleValue();
			monedaConvertida = this.valorMoneda * factor;
		}
		monedaConvertida = this.roundDouble(monedaConvertida);
		this.showMoneda(monedaConvertida, monedaConvertir);
		
	}
	
	// Método que redondea valor a 2 decimales
	public double roundDouble(double valor) {
		 BigDecimal bd = new BigDecimal(Double.toString(valor));
		 bd = bd.setScale(2, RoundingMode.HALF_UP);
		 return bd.doubleValue();
	}
}

package ConversorMonedas;
import javax.swing.JOptionPane;

public class Moneda {
	private double valorMoneda;
	
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
	
	public void showMoneda() {
		JOptionPane.showMessageDialog(null, "Posees " + this.valorMoneda);
	}
}

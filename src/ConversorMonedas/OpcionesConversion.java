package ConversorMonedas;

import javax.swing.JOptionPane;


public class OpcionesConversion {
	private static Object[] listaOpciones = {"De Pesos Chilenos a Dólar",
						  			  "De Pesos Chilenos a Euro",
									  "De Pesos Chilenos a Libras",
							   	      "De Pesos Chilenos a Yen",
									  "De Pesos Chilenos a Won Coreano",
									  "De Dólar a Pesos Chilenos",
									  "De Euro a Pesos Chilenos",
									  "De Libras Pesos Chilenos",
									  "De Yen a Pesos Chilenos",
									  "De Won Coreano a Pesos Chilenos"};
	
	public static void desplegarOpciones() {
		JOptionPane.showInputDialog(null, "Elije la moneda a la que quieres convertir tu dinero",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, 
				listaOpciones, "Elegir").toString();
	}
}

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
	
	/* Método que despliega las opciones de conversión y retorna
	  un arreglo con 2 elementos que servirá de información a la clase Moneda */
	public static String[] desplegarOpciones() {
		String ops = JOptionPane.showInputDialog(null, "Elije la moneda a la que quieres convertir tu dinero",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, 
				listaOpciones, "Elegir").toString();
		
		String[] parametrosMoneda = new String[2];
		/* Este arreglo servirá de info a la clase Moneda para definir 
		 el tipo de moneda que se tiene y la moneda a la que se quiere convertir 
		 
		 Posición 0: tipo de moneda que se tiene  
		 Posición 1: tipo de moneda a la que se quiere convertir */
		
		switch(ops) {
		
			case "De Pesos Chilenos a Dólar": {
				parametrosMoneda[0] = "pesos chilenos";
				parametrosMoneda[1] = "dolares";
				break;
			} 
		
			case "De Pesos Chilenos a Euro": {
				parametrosMoneda[0] = "pesos chilenos";
				parametrosMoneda[1] = "euros";
				break;
			}
			
			case "De Pesos Chilenos a Libras": {
				parametrosMoneda[0] = "pesos chilenos";
				parametrosMoneda[1] = "libras";
				break;
			}
			
			case "De Pesos Chilenos a Yen": {
				parametrosMoneda[0] = "pesos chilenos";
				parametrosMoneda[1] = "yenes";
				break;
			}
			
			case "De Pesos Chilenos a Won Coreano": {
				parametrosMoneda[0] = "pesos chilenos";
				parametrosMoneda[1] = "wons coreanos";
				break;
			}
			
			case "De Dólar a Pesos Chilenos": {
				parametrosMoneda[0] = "dolares";
				parametrosMoneda[1] = "pesos chilenos";
				break;
			}
			
			case "De Euro a Pesos Chilenos": {
				parametrosMoneda[0] = "euros";
				parametrosMoneda[1] = "pesos chilenos";
				break;
			}
			
			case "De Libras Pesos Chilenos": {
				parametrosMoneda[0] = "libras";
				parametrosMoneda[1] = "pesos chilenos";
				break;
			}
			
			case "De Yen a Pesos Chilenos": {
				parametrosMoneda[0] = "yenes";
				parametrosMoneda[1] = "pesos chilenos";
				break;
			}
			
			case "De Won Coreano a Pesos Chilenos": {
				parametrosMoneda[0] = "wons coreanos";
				parametrosMoneda[1] = "pesos chilenos";
				break;
			}
				
		}
		
		return parametrosMoneda;
	}
}

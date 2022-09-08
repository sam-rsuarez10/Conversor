import javax.swing.*;
import ConversorMonedas.*;
public class Main {
	public static void main(String[] args) {
		String opcionesConversor = JOptionPane.showInputDialog(null, "Seleccione un conversor",
				"Menú Principal", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Elegir").toString();
		
		switch(opcionesConversor) {
			case "Conversor de Moneda": {
				Moneda monedaUsuario = new Moneda();
				// se despliegan las opciones de conversion
				String[] unidadesMoneda = OpcionesConversion.desplegarOpciones();
				monedaUsuario.setTipoMoneda(unidadesMoneda[0]); // se setea el tipo de moneda que posee el usuario
				monedaUsuario.setMonedaConvertir(unidadesMoneda[1]); // se setea el tipo de moneda que se quiere convertir
				
				monedaUsuario.inputMoneda();
				monedaUsuario.showMoneda();
				break;
			}
			case "Conversor de Temperatura":
				JOptionPane.showMessageDialog(null, "Este conversor todavía se está desarrollando :b");
				break;
			default:
				JOptionPane.showMessageDialog(null, "ocurrió un error :(");
		}
	}
}

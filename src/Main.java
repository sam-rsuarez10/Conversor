import javax.swing.*;
import ConversorMonedas.*;

public class Main {
	public static void main(String[] args) {

		// main loop
		boolean runFlag = true; // flag que indica si el programa debe continuar o finalizar
		while (runFlag) { // Desliegue menú de conversores String
			// Desliegue menú de conversores
			try {
				String opcionesConversor = JOptionPane
						.showInputDialog(null, "Seleccione un conversor", "Menú Principal", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Elegir")
						.toString();
				
				if (opcionesConversor == "Conversor de Moneda") {
					Moneda monedaUsuario = new Moneda();
					// se despliegan las opciones de conversion
					String[] unidadesMoneda = OpcionesConversion.desplegarOpciones();
					monedaUsuario.inputMoneda();
					monedaUsuario.convertirMoneda(unidadesMoneda[0], unidadesMoneda[1]);
				} else if (opcionesConversor == "Conversor de Temperatura") {
					JOptionPane.showMessageDialog(null, "Este conversor todavía se está desarrollando :b");
				} else {
					JOptionPane.showMessageDialog(null, "ocurrió un error :(");
				}

			} catch (NullPointerException exp) {
				// Usuario presionó cancel en el menú principal
				JOptionPane.showMessageDialog(null, "Programa terminado");
				break;
			}

			// Despliegue menú de continuar
			int inputContinuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar utilizando el conversor?",
					"Seguir convirtiendo...", JOptionPane.YES_NO_CANCEL_OPTION);
			
			// Procesamiento de la opción elegida por el usuario
			if (inputContinuar == 2 || inputContinuar == 1) {
				// cancel
				// se despliega mensaje de que finalizó el programa
				JOptionPane.showMessageDialog(null, "Programa terminado");
				runFlag = false;
			}
			// No se hace if por la opción de que sí quiera continuar ya que el flag está seteado true por defecto
		}
	}
}

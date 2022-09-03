import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		String opcionesConversor = JOptionPane.showInputDialog(null, "Seleccione un conversor",
				"Menú Principal", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Elegir").toString();
	}
}

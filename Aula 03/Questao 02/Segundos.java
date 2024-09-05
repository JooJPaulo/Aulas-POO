import javax.swing.JOptionPane;

public class Segundos {
    public static void main(String[] args) {
		int segundos;

		String input = JOptionPane.showInputDialog("Digite a quantidade de segundos:");
        segundos = Integer.parseInt(input);

		int dias = (int) (segundos / 86400);
		segundos = segundos % 86400;

		int horas = (int) (segundos / 3600);
		segundos = segundos % 3600;

		int minutos = (int) (segundos / 60);
		segundos = segundos % 60;

		JOptionPane.showMessageDialog(null, "Dias: " + dias);
        JOptionPane.showMessageDialog(null, "Horas: " + horas);
        JOptionPane.showMessageDialog(null, "Minutos: " + minutos);
        JOptionPane.showMessageDialog(null, "Segundos: " + segundos);
    }
}
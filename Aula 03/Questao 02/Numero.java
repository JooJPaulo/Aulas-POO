import javax.swing.JOptionPane;

public class Numero {
    public static void main(String[] args) {
		int num;

		String input = JOptionPane.showInputDialog("Digite um número de 05 dígitos:");
        num = Integer.parseInt(input);

		int digito1 = num / 10000;
		num = num % 10000;

		int digito2 = num / 1000;
		num = num % 1000;

		int digito3 = num / 100;
		num = num % 100;

		int digito4 = num / 10;
		num = num % 10;

		int digito5 = num;

		JOptionPane.showMessageDialog(null, digito1 + "   " + digito2 + "   " + digito3 + "   " + digito4 + "   " + digito5);
    }
}

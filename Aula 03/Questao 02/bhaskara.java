import javax.swing.JOptionPane;

public class Bhaskara {
    public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		

		String input = JOptionPane.showInputDialog("Digite o valor de a:");
        a = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("Digite o valor de b:");
        b = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("Digite o valor de c:");
        c = Double.parseDouble(input);

		delta = (b * b) - (4 * a * c);

		if (delta < 0) {
			JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.");
		} else if (delta == 0) {
			x1 = -b / (2 * a);
			JOptionPane.showMessageDialog(null, "A equação possui uma raiz real: " + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, "A equação possui duas raízes reais: " + x1 + " e " + x2);
		}
    }
}

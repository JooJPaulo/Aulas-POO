import javax.swing.JOptionPane;

public class Operacoes {
    public static void main(String[] args) {
        int num1, num2;

        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        num1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        num2 = Integer.parseInt(input2);

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;

        JOptionPane.showMessageDialog(null, "A soma dos dois números é: " + sum);
        JOptionPane.showMessageDialog(null, "A diferença dos dois números é: " + difference);
        JOptionPane.showMessageDialog(null, "O produto dos dois números é: " + product);
        JOptionPane.showMessageDialog(null, "A divisão dos dois números é: " + division);
    }
}
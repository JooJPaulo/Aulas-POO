import javax.swing.JOptionPane;

public class Grafico {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Digite um número entre 1 e 30:");
            int numero = Integer.parseInt(input);

            
            if (numero < 1 || numero > 30) {
                JOptionPane.showMessageDialog(null, "Número inválido. Digite um número entre 1 e 30.");
                i--; 
            } else {
                numeros[i] = numero;
            }
        }

        
        StringBuilder result = new StringBuilder();
        for (int numero : numeros) {
            for (int j = 0; j < numero; j++) {
                result.append("*");
            }
            result.append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
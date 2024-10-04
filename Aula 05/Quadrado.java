import javax.swing.JOptionPane;

class Quadrado {
    public static int calcularQuadrado(int n) {
        int quadrado = 0;
        int numeroImpar = 1;

        for (int i = 0; i < n; i++) {
            quadrado += numeroImpar;
            numeroImpar += 2;
        }

        return quadrado;
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        int n = Integer.parseInt(input);

        int resultado = calcularQuadrado(n);

        JOptionPane.showMessageDialog(null, "O quadrado de " + n + " é: " + resultado);
    }
}
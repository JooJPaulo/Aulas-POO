public class Complex {
    private float parteReal;
    private float parteImaginaria;

    // Constructor with parameters
    public Complex(float parteReal, float parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // No-argument constructor with default values
    public Complex() {
        this(0.0f, 0.0f);
    }

    // Method to add two complex numbers
    public Complex somar(Complex outro) {
        return new Complex(this.parteReal + outro.parteReal, this.parteImaginaria + outro.parteImaginaria);
    }

    // Method to subtract two complex numbers
    public Complex subtrair(Complex outro) {
        return new Complex(this.parteReal - outro.parteReal, this.parteImaginaria - outro.parteImaginaria);
    }

    // Method to print the complex number
    public void imprimir() {
        System.out.println("(" + parteReal + ", " + parteImaginaria + ")");
    }

    public static void main(String[] args) {
        // Test the Complex class
        Complex num1 = new Complex(3.0f, 4.0f);
        Complex num2 = new Complex(1.0f, 2.0f);

        System.out.print("Número 1: ");
        num1.imprimir();

        System.out.print("Número 2: ");
        num2.imprimir();

        Complex soma = num1.somar(num2);
        System.out.print("Soma: ");
        soma.imprimir();

        Complex subtracao = num1.subtrair(num2);
        System.out.print("Subtração: ");
        subtracao.imprimir();
    }
}

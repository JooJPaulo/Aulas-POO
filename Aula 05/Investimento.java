public class Investimento {
    public static void main(String[] args) {
        double p = 1000;
        double r = 0.05;
        int n = 10;

        for (int ano = 1; ano <= n; ano++) {
            double a = p * Math.pow(1 + r, ano);
            System.out.printf("A quantia no fim do ano %d é: $%.2f%n", ano, a);
        }
    }
}
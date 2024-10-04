public class Produto {
    public static void main(String[] args) {
        int product = 1;

        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }

        System.out.println("O produto dos números inteiros ímpares de 1 a 15 é: " + product);
    }
}
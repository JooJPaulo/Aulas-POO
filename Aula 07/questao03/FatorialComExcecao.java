package questao03;

import java.util.Scanner;

public class FatorialComExcecao {
    public static int fatorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Número negativo.");
        }
        if (n == 0) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        scanner.close();
        try {
            System.out.println("Fatorial de " + n + ": " + fatorial(n));
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }

}

import java.util.Scanner;

public class FibonacciNR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro maior ou igual a 3: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 3) {
            System.out.println("O número deve ser maior ou igual a 3.");
            return;
        }

        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("O " + n + "° termo da série de Fibonacci é: " + c);
    }
}

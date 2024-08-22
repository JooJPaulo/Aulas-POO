import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de números da sequência de Fibonacci que deseja: ");
            int quantidade = scanner.nextInt();
            
            int num1 = 0, num2 = 1;
            System.out.print("Sequência de Fibonacci: " + num1 + " " + num2);

            for (int i = 2; i < quantidade; i++) {
                int num3 = num1 + num2;
                System.out.print(" " + num3);
                num1 = num2;
                num2 = num3;
            }
            System.out.println();
        }
    }
}

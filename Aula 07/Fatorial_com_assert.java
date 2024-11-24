import java.util.Scanner;

public class Fatorial_com_assert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        assert num >= 0 : "O número deve ser maior ou igual a zero";

        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é " + fatorial);
    }
}

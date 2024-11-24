import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();

        assert num1 < num2 && num2 < num3 : "Os números não estão em ordem crescente";

        System.out.println("Os números estão em ordem crescente");
    }
}

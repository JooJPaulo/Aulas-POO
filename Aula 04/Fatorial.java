import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int fatorial = 1;

        System.out.print("Digite um número inteiro positivo: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);

    }
}

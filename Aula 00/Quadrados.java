import java.util.Scanner;

public class Quadrados {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num, resultado = 0;

            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            for (int i = 0; i < num; i++) {
                resultado += 2 * i + 1;
            }

            System.out.printf("O quadrado de %d é %d.%n", num, resultado);
        }
    }
}

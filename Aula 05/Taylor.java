import java.util.Scanner;

public class Taylor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de x (em radianos): ");
        double x = scanner.nextDouble();
        System.out.print("Digite o número de termos da série: ");
        int termos = scanner.nextInt();
        scanner.close();

        double cosX = 1.0;
        double termo = 1.0;
        int sinal = -1;

        for (int i = 1; i < termos; i++) {
            termo *= x * x / (2 * i * (2 * i - 1));
            cosX += sinal * termo;
            sinal *= -1;
        }

        System.out.println("O valor aproximado de cos(" + x + ") é: " + cosX);
    }
}

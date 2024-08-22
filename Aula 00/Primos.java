import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a posição do número primo desejado: ");
            int posicao = scanner.nextInt();
            int num = 2;
            int ct = 0;

            while (ct < posicao) {
                if (ehPrimo(num)) {
                    ct++;
                }
                if (ct < posicao) {
                    num++;
                }
            }

            System.out.printf("O %dº número primo é %d%n", posicao, num);
        }
    }

    public static boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

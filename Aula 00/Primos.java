import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 2;
        int posicao;
        boolean primo = true;
        int ct = 0;

        System.out.print("Digite um número: ");
        posicao = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        while (ct < posicao) {
            if (primo && num > 1) {
            System.out.printf("O número %d é primo%n", num);
            posicao++;
        } else {
            System.out.printf("O número %d não é primo%n", num);
        }
    }
        System.out.printf("O %d número primo é %d", posicao, num);
    }
}

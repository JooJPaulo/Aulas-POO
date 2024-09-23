import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado;

        System.out.print("Digite o tamanho do quadrado (de 01 até 20): ");
        lado = scanner.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
        }
    }
}

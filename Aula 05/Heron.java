import java.util.Scanner;

public class Heron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro e positivo para N: ");
        int N = scanner.nextInt();
        scanner.close();

        double k = N; 
        System.out.println("Aproximações da raiz quadrada de " + N + ":");

        for (int i = 0; i < 12; i++) {
            k = (k + N / k) / 2;
            System.out.println("Iteração " + (i + 1) + ": " + k);
        }

        System.out.println("Valor aproximado da raiz quadrada de " + N + " após 12 iterações: " + k);
    }
}

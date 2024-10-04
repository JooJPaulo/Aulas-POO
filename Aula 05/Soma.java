import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro e positivo para N: ");
        int N = scanner.nextInt();
        scanner.close();

        double soma = 1.0; 
        double fatorial = 1.0;

        for (int i = 2; i <= N; i++) {
            fatorial *= i; 
            soma += 1.0 / fatorial; 
        }

        System.out.println("A soma da série é: " + soma);
    }
}

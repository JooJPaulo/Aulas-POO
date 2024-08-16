import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posicao;
        int num1 = 1;
        int num2 = 1;

        System.out.println("Digite um número: ");
        posicao = scanner.nextInt();
    }

    public int fibo(int posicao) {
        if (posicao <= 2) {
            return 1;
        } else {
            return fibo(posicao - 1) + fibo(posicao - 2);
        }
    }

}

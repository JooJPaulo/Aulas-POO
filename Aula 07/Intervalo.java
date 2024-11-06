import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 100: ");
        int numero = scanner.nextInt();

        assert (numero >= 1 && numero <= 100) : "Número fora do intervalo: " + numero;

        System.out.println("Número dentro do intervalo.");
    }
}

import java.util.Scanner;

public class Preco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        assert (preco >= 0) : "Preço negativo: " + preco;

        System.out.println("Preço válido: " + preco);
    }
}

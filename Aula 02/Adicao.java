import java.util.Scanner;

public class Adicao {
	public static void main(String[] args) {
		int num1, num2, soma;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número: ");
			num1 = entrada.nextInt();

			System.out.println("Digite o segundo número: ");
			num2 = entrada.nextInt();
		}
		
		soma = num1 + num2;

		System.out.printf("A soma de %d e %d é: %d", num1, num2, soma);
	}
}
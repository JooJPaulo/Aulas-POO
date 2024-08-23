import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		try (/*Exercício 01*/
		Scanner scanner = new Scanner(System.in)) {
			int num1, num2;

			System.out.println("Digite o primeiro número: ");
			num1 = scanner.nextInt();

			System.out.println("Digite o segundo número: ");
			num2 = scanner.nextInt();

			System.out.println("A soma dos dois números é: " + (num1 + num2));
			System.out.println("A diferença dos dois números é: " + (num1 - num2));
			System.out.println("o produto dos dois números é: " + (num1 * num2));
			System.out.println("A divisão dos dois números é: " + (num1 / num2));
		}

	}
}

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		int num;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
		}
		
		if(num % 2 == 0) {
			System.out.printf("O número %d é par", num);
		} else {
			System.out.printf("O número %d é ímpar", num);

		}
	}
}
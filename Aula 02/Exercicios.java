import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		/*Exercício 01*/
				/*
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
				
				*/
				/* Exercício 02 */
				/*
				Scanner scanner = new Scanner(System.in)) {
				String num;

				System.out.println("Digite um número de 05 dígitos: ");
				num = scanner.next();

				if (num.length() == 5) {
					// Imprimir os dígitos separados por três espaços
					System.out.println("Número: " + num.charAt(0) + "   " + num.charAt(1) + "   " + num.charAt(2) + "   " + num.charAt(3) + "   " + num.charAt(4));
				} else {
					System.out.println("Por favor, digite um número com exatamente 5 dígitos.");
					*/

				/* Exercício 03 */
				/*
				Scanner scanner = new Scanner(System.in);
				double a, b, c, delta, x1, x2;
				

				System.out.println("Digite o valor de a: ");
				a = scanner.nextDouble();

				System.out.println("Digite o valor de b: ");
				b = scanner.nextDouble();

				System.out.println("Digite o valor de c: ");
				c = scanner.nextDouble();

				delta = (b * b) - (4 * a * c);

				if (delta < 0) {
					System.out.println("A equação não possui raízes reais.");
				} else if (delta == 0) {
					x1 = -b / (2 * a);
					System.out.println("A equação possui uma raiz real: " + x1);
				} else {
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.println("A equação possui duas raízes reais: " + x1 + " e " + x2);
				}
				*/

				/* Exercício 04 */
				Scanner scanner = new Scanner(System.in);
				int segundos;

				System.out.println("Digite a quantidade de segundos: ");
				segundos = scanner.nextInt();

				int dias = (int) (segundos / 86400);
				segundos = segundos % 86400;

				int horas = (int) (segundos / 3600);
				segundos = segundos % 3600;

				int minutos = (int) (segundos / 60);
				segundos = segundos % 60;

				System.out.println("Dias: " + dias);
				System.out.println("Horas: " + horas);
				System.out.println("Minutos: " + minutos);
				System.out.println("Segundos: " + segundos);
		}
	}


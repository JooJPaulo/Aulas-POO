import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
			/*Exercício 01*/
				/*
					Scanner scanner = new Scanner(System.in); 
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
				Scanner scanner = new Scanner(System.in); 
				int num;

				System.out.println("Digite um número de 05 dígitos: ");
				num = scanner.nextInt();

				int digito1 = num / 10000;
				num = num % 10000;

				int digito2 = num / 1000;
				num = num % 1000;

				int digito3 = num / 100;
				num = num % 100;

				int digito4 = num / 10;
				num = num % 10;

				int digito5 = num;

				System.out.println(digito1 + "   " + digito2 + "   " + digito3 + "   " + digito4 + "   " + digito5);
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
				/*
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
				*/
		}
	}

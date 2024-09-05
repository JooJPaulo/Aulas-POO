package Exercícios;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
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
    }
}

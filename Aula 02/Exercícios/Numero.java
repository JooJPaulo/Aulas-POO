package Exercícios;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
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
    }
}

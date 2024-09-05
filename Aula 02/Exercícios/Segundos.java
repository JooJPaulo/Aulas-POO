package Exercícios;

import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {
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

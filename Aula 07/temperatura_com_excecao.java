import java.util.Scanner;
public class Temperatura_com_excecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        try {
            if (temperatura != (int) temperatura) {
                scanner.close();
                throw new NumberFormatException("Temperatura inválida.");
            }
        } catch (NumberFormatException e) {
            scanner.close();
            return;
        }
        System.out.println("Digite a escala da temperatura (C ou F): ");
        String escala = scanner.next().toUpperCase();
        scanner.close();
        double temperaturaConvertida = 0;
        try {
            if (escala.equals("C")) {
                temperaturaConvertida = (temperatura * 9 / 5) + 32;
            } else if (escala.equals("F")) {
                temperaturaConvertida = (temperatura - 32) * 5 / 9;
            } else {
                throw new IllegalArgumentException("Escala inválida.");
            }
            System.out.println("Temperatura convertida: " + temperaturaConvertida);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
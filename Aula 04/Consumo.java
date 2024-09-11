import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia;
        int combustivel;
        double consumo;

        System.out.print("Distância percorrida (km): ");
        distancia = scanner.nextInt();

        System.out.print("Combustível gasto (l): ");
        combustivel = scanner.nextInt();

        consumo = distancia / (double)combustivel;

        System.out.println("Consumo médio: " + consumo + " km/l");
    }
}

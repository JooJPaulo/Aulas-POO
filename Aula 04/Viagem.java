import java.util.Scanner;

public class Viagem {
/* Exercício resolvido não seguindo o princípio da orientação a objetos
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
*/

    private int km;
        private static int totalKm;
        private int litros;
        private static int totalLitros;
        private String trajeto;

        public Viagem (String trajeto, int km, int litros) {
            this.trajeto = trajeto;
            this.km = km;
            this.litros = litros;
            totalKm += km;
            totalLitros += litros;
        }

        
        
}
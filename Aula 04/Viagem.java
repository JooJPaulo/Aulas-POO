import java.util.Scanner;

public class Viagem {

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

        public String getTrajeto() {
            return this.trajeto;
        }

        public double consumo() {
            return this.km / this.litros;
        }

        public int getKm() {
            return this.km;
        }

        public int getLitros() {
            return this.litros;
        }

        public static int totalKm() {
            return totalKm;
        }

        public static int totalLitros() {
            return totalLitros;
        }
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String trajeto;
            int km;
            int litros;
            Viagem viagem;
            char continuar;
            
            do {
                System.out.print("Trajeto: ");
                trajeto = scanner.nextLine();
                
                System.out.print("Distância (km): ");
                km = scanner.nextInt();
                
                System.out.print("Litros: ");
                litros = scanner.nextInt();
                
                viagem = new Viagem(trajeto, km, litros);
                
                System.out.println("Deseja continuar (s/n)? ");
                continuar = scanner.next().charAt(0);
            } while (continuar == 's');
            
            System.out.println("Total de km percorridos: " + Viagem.totalKm());
            System.out.println("Total de litros gastos: " + Viagem.totalLitros());
            
        }
}
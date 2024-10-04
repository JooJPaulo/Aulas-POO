public class Fatorial20 {
    long fatorial(int n) {
        long f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static void main(String[] args) {
        Fatorial20 f = new Fatorial20();
        
        for (int i = 1; i <= 20; i++) {
            System.out.printf("O fatorial de %d é: %d%n", i, f.fatorial(i));
        }
    }
}

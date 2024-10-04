public class Pi {
    public static void main(String[] args) {
        double pi = 0;
        double denominador = 1;
        for (int i = 0; i < 200000; i++) {
            if (i % 2 == 0) {
                pi += (4 / denominador);
            } else {
                pi -= (4 / denominador);
            }
            denominador += 2;
            
            System.out.println((i+1) + ":\t" + pi);
            
            if(String.valueOf(pi).startsWith("3.14159")){
                System.out.println("O primeiro valor que começa com '3.14159' foi obtido no termo: " + (i+1));
                break;
            }
        }
    }
}

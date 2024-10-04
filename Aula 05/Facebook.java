public class Facebook {
    public static void main(String[] args) {
        double usuarios = 1_000_000_000;
        double taxaCrescimento = 0.04;
        double meta1 = 1_500_000_000;
        double meta2 = 2_000_000_000;

        int mesesParaMeta1 = calcularMeses(usuarios, taxaCrescimento, meta1);
        int mesesParaMeta2 = calcularMeses(usuarios, taxaCrescimento, meta2);

        System.out.println("Meses necessários para alcançar 1,5 bilhão de usuários: " + mesesParaMeta1);
        System.out.println("Meses necessários para alcançar 2 bilhões de usuários: " + mesesParaMeta2);
    }

    public static int calcularMeses(double usuarios, double taxaCrescimento, double meta) {
        int meses = 0;
        while (usuarios < meta) {
            usuarios += usuarios * taxaCrescimento;
            meses++;
        }
        return meses;
    }
}

import java.util.Scanner;

public class ContaBancaria {
    private static double saldo;

    public ContaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void getSaldo() {
        System.out.println("Saldo: " + saldo);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial da conta: ");
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);
        System.out.println("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
        conta.getSaldo();
        System.out.println("O valor na conta é: " + saldo);

    }
}
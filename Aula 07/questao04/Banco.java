package questao04;

import java.util.Scanner;

public class Banco {
    private double saldo;
    private double saldoInicial = 1500.00;

    public void saque(double valor) throws SaldoIncuficienteException {
        if (valor > saldo) {
            throw new SaldoIncuficienteException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.saldo = banco.saldoInicial;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saldo inicial: " + banco.getSaldoInicial());
        System.out.print("Digite o valor do saque: ");
        double valor = scanner.nextDouble();
        try {
            banco.saque(valor);
            System.out.println("Saque realizado com sucesso.");
        } catch (SaldoIncuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo atual: " + banco.getSaldo());
        System.out.print("Digite o valor do depósito: ");
        valor = scanner.nextDouble();
        banco.deposito(valor);
        System.out.println("Depósito realizado com sucesso.");
        System.out.println("Saldo atual: " + banco.getSaldo());
        scanner.close();
    }

}

import java.util.Scanner;

public class Credito {
    private int numeroConta, saldoInicial, totalItens, totalCreditos, limiteCredito, novoSaldo;

    public Credito(int numeroConta, int saldoInicial, int totalItens, int totalCreditos, int limiteCredito) {
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
        this.totalItens = totalItens;
        this.totalCreditos = totalCreditos;
        this.limiteCredito = limiteCredito;

        this.novoSaldo = this.saldoInicial + this.totalItens - this.totalCreditos;
        
        if (this.novoSaldo > this.limiteCredito) {
            System.out.println("Limite de crédito excedido!");
        } else {
            System.out.println("Limite de crédito não excedido!");
        }

        System.out.println("Novo saldo: " + this.novoSaldo);

    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public int getSaldoInicial() {
        return this.saldoInicial;
    }

    public int getTotalItens() {
        return this.totalItens;
    }

    public int getTotalCreditos() {
        return this.totalCreditos;
    }

    public int getLimiteCredito() {
        return this.limiteCredito;
    }

    public int getNovoSaldo() {
        return this.novoSaldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta, saldoInicial, totalItens, totalCreditos, limiteCredito;
        Credito credito;
        char continuar;

        do {
            System.out.print("Número da conta: ");
            numeroConta = scanner.nextInt();

            System.out.print("Saldo inicial: ");
            saldoInicial = scanner.nextInt();

            System.out.print("Total de itens: ");
            totalItens = scanner.nextInt();

            System.out.print("Total de créditos: ");
            totalCreditos = scanner.nextInt();

            System.out.print("Limite de crédito: ");
            limiteCredito = scanner.nextInt();

            credito = new Credito(numeroConta, saldoInicial, totalItens, totalCreditos, limiteCredito);

            System.out.println("Deseja continuar (s/n)? ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's');

    }

}

import java.util.Scanner;

public class Date {
    public void displayDate(int dia, int mes, int ano) {
        System.out.println(dia + "/" + mes + "/" + ano);
    }


    public void setDia(int dia) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        dia = scanner.nextInt();
        this.dia = dia;
    }

    public void setMes(int mes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o mês: ");
        mes = scanner.nextInt();
        this.mes = mes;
    }

    public void setAno(int ano) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        ano = scanner.nextInt();
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    private int dia, mes, ano;

}
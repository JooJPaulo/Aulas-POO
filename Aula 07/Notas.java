import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno (0-10): ");
        int nota = scanner.nextInt();

        assert (nota >= 0 && nota <= 10) : "Nota fora do intervalo: " + nota;

        System.out.println("Nota dentro do intervalo: " + nota);
    }
}

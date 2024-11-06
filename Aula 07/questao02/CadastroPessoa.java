package questao02;

import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        try {
            Pessoa pessoa = new Pessoa(nome, idade);
            System.out.println("Pessoa cadastrada com sucesso.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}

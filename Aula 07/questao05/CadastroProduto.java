package questao05;

import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String produto;
        double preco;

        try {
            System.out.print("Digite o nome do produto: ");
            produto = scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            preco = scanner.nextDouble();
            if (preco <= 0) {
                throw new PrecoInvalidoException("Preço inválido.");
            } else {
                System.out.println("Produto cadastrado com sucesso.");
            }
        } catch (PrecoInvalidoException e) {        
                System.out.println(e.getMessage());
            } finally {
                scanner.close();
            }           
    }
}

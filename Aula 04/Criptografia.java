import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de quatro dígitos para criptografar: ");
        int numero = scanner.nextInt();

        int digito1 = (numero / 1000) % 10;
        int digito2 = (numero / 100) % 10;
        int digito3 = (numero / 10) % 10;
        int digito4 = numero % 10;

        digito1 = (digito1 + 7) % 10;
        digito2 = (digito2 + 7) % 10;
        digito3 = (digito3 + 7) % 10;
        digito4 = (digito4 + 7) % 10;
        
        int temp = digito1;
        digito1 = digito3;
        digito3 = temp;
        
        temp = digito2;
        digito2 = digito4;
        digito4 = temp;
        
        int numeroCriptografado = digito1 * 1000 + digito2 * 100 + digito3 * 10 + digito4;
        System.out.println("Número criptografado: " + numeroCriptografado);
        
        scanner.close();
    }
}

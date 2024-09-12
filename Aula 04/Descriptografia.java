import java.util.Scanner;

public class Descriptografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de quatro dígitos para descriptografar: ");
        int numeroCriptografado = scanner.nextInt();
        
        int digito1 = (numeroCriptografado / 1000) % 10;
        int digito2 = (numeroCriptografado / 100) % 10;
        int digito3 = (numeroCriptografado / 10) % 10;
        int digito4 = numeroCriptografado % 10;

        int temp = digito1;
        digito1 = digito3;
        digito3 = temp;
        
        temp = digito2;
        digito2 = digito4;
        digito4 = temp;

        digito1 = (digito1 + 3) % 10;
        digito2 = (digito2 + 3) % 10;
        digito3 = (digito3 + 3) % 10;
        digito4 = (digito4 + 3) % 10;

        int numero = digito1 * 1000 + digito2 * 100 + digito3 * 10 + digito4;
        System.out.println("Número descriptografado: " + numero);
        
        scanner.close();
    }
}

import java.util.Scanner;

public class contagemDigito {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro para saber a quantidade: ");
            int numero = scanner.nextInt();

            int quantidadeDigitos = String.valueOf(Math.abs(numero)).length();

            System.out.println("O número " + numero + " possui " + quantidadeDigitos + " dígitos.");

            scanner.close();
        }
    }
import java.util.Scanner;

public class palimetroNumero {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            int numeroOriginal = numero;
            int numeroInvertido = 0;

            while (numero > 0) {
                int digito = numero % 10;
                numeroInvertido = numeroInvertido * 10 + digito;
                numero /= 10;
            }

            if (numeroOriginal == numeroInvertido) {
                System.out.println("O número " + numeroOriginal + " é um palíndromo.");
            } else {
                System.out.println("O número " + numeroOriginal + " não é um palíndromo.");
            }

            scanner.close();
        }
    }


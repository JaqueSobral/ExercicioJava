import java.util.Scanner;

public class inverteNumeros {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            int numeroInvertido = 0;
            int numeroOriginal = Math.abs(numero);

            while (numeroOriginal > 0) {
                int digito = numeroOriginal % 10;
                numeroInvertido = numeroInvertido * 10 + digito;
                numeroOriginal /= 10;
            }

            if (numero < 0) {
                numeroInvertido *= -1;
            }

            System.out.println("O número invertido é: " + numeroInvertido);

            scanner.close();
        }
    }
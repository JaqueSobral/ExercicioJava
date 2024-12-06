import java.util.Scanner;

public class numerosPrimos {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro para saber se é um número primo: ");
            int numero = scanner.nextInt();

                boolean numeroPrimo = true;
            if (numero > 1) {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        numeroPrimo = false;
                        break;
                    }
                }
            } else {
                numeroPrimo = false;
            }
            if (numeroPrimo) {
                System.out.println("O número digitado " + numero + " é primo.");
            } else {
                System.out.println("O número digitado " + numero + " não é primo.");
            }
            scanner.close();
        }
    }

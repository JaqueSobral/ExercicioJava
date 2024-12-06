import java.util.Scanner;

public class fatoralNumeros {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro para ser fatorado: ");
            int n = scanner.nextInt();

            int fatorial = 1;
            int contador = n;

            while (contador > 1) {
                fatorial *= contador;
                contador--;
            }

            System.out.println("O fatorial de " + n + " é: " + fatorial);

            // Fecha o scanner
            scanner.close();
        }
    }


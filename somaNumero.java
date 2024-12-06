import java.util.Scanner;

public class somaNumero {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro positivo: ");
            int n = scanner.nextInt();

            if (n < 1) {
                System.out.println("Erro: Digite um número inteiro positivo maior ou igual a 1.");
            } else {
                int soma = 0;
                for (int i = 1; i <= n; i++) {
                    soma += i;
                }
                System.out.println("A soma dos números de 1 a " + n + " é: " + soma);
            }
            scanner.close();
        }
    }

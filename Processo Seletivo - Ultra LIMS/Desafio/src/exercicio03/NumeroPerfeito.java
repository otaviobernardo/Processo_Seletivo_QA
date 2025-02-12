//Um número perfeito é um número inteiro positivo que é igual à soma de todos os seus divisores positivos, excluindo ele mesmo. Implemente um programa que verifique se um número dado é perfeito.

package exercicio03;
import java.util.Scanner;


public class NumeroPerfeito {
    public static boolean ehNumeroPerfeito(int n) {
        int soma = 0;

        // Percorre de 1 até n/2 para encontrar os divisores
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                soma += i; // Soma os divisores
            }
        }

        return soma == n; // Retorna verdadeiro se a soma dos divisores for igual ao número
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica e exibe se é um número perfeito
        System.out.println(ehNumeroPerfeito(numero));

        scanner.close();
    }
}


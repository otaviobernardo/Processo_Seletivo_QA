// Crie um programa que, dado um número inteiro n, retorne os primeiros n números da sequência de Fibonacci

package exercicio01;
import java.util.Scanner;


public class Fibonacci {
    public static void gerandoFibonacci(int num) {
        int primeiro = 0;
        int segundo = 1;

        for (int i = 0; i < num; i++) {
            System.out.println(primeiro + " ");
            int proximoNum = primeiro + segundo;
            primeiro = segundo;
            segundo = proximoNum;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();

        System.out.println("Os primeiros " + n + " números da sequÊncia de Fibonacci são: ");
        gerandoFibonacci(n);

        input.close();
    }
}

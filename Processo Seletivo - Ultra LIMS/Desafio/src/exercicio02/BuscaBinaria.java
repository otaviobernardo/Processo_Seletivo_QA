// Implemente um algoritmo de busca binária que, dado um número inteiro alvo e uma lista de números inteiros ordenada de forma crescente, retorne o índice da primeira ocorrência do número na lista. Caso o número não esteja presente, retorne -1.
// Regras: ● O algoritmo deve utilizar a estratégia de busca binária (divisão da lista em partesmenores). ● A entrada será sempre uma lista já ordenada.

package exercicio02;
import java.util.Scanner;


public class BuscaBinaria {
    public static int buscaBinaria(int[] lista, int alvo) {
        int inicio = 0, fim = lista.length - 1;
        int resultado = -1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (lista[meio] == alvo) {
                resultado = meio; // Salva o índice encontrado
                fim = meio - 1; // Continua buscando a primeira ocorrência
            } else if (lista[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lista = {5, 12, 18, 23, 45, 70, 89};

        System.out.print("Digite o número alvo: ");
        int alvo = scanner.nextInt();

        // Chamando a busca binária
        int indice = buscaBinaria(lista, alvo);

        System.out.println("Índice da primeira ocorrência: " + indice);

        scanner.close();
    }
}

package exercicio05;

import java.util.Scanner;

public class CaixaEletronico {
    public static void calcularSaque(int valor) {
        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {1};
        
        System.out.print("Notas: ");
        for (int nota : notas) {
            int qtdNotas = valor / nota;
            if (qtdNotas > 0) {
                System.out.println(qtdNotas + " nota(s) de " + nota);
                valor -= qtdNotas * nota; 
            }
        }

        // Contagem das moedas
        if (valor > 0) {
            System.out.print("Moedas: ");
            for (int moeda : moedas) {
                int qtdMoedas = valor / moeda;  // Divide o valor pelas moedas
                if (qtdMoedas > 0) {
                    System.out.println(qtdMoedas + " moeda(s) de " + moeda);
                    valor -= qtdMoedas * moeda;  // Subtrai o valor das moedas usadas
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor para saque: ");
        int valor = scanner.nextInt();
        
        calcularSaque(valor);
        scanner.close();
    }
}


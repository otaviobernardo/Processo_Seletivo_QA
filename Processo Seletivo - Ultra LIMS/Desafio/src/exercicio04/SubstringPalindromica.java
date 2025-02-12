//Implemente um programa que, dada uma string, encontre a maior substring palindrômica dentro dela.
//Regras: ● Uma substring palindrômica é uma sequência de caracteres que pode ser lida da mesma forma da esquerda para a direita e da direita para a esquerda. ● Caso haja múltiplas substrings de mesmo tamanho, retorne qualquer uma delas.

package exercicio04;

public class SubstringPalindromica {
    public static String maiorPalindromo(String s) {
        if (s == null || s.length() < 1) return "";

        int inicio = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expande para verificar palíndromos de tamanho ímpar e par
            int len1 = expandir(s, i, i);      // Palíndromo com centro único (ímpar)
            int len2 = expandir(s, i, i + 1);  // Palíndromo com centro duplo (par)
            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;
                inicio = i - (len - 1) / 2;
            }
        }

        return s.substring(inicio, inicio + maxLen);
    }

    private static int expandir(String s, int esq, int dir) {
        while (esq >= 0 && dir < s.length() && s.charAt(esq) == s.charAt(dir)) {
            esq--;
            dir++;
        }
        return dir - esq - 1; // Comprimento do palíndromo encontrado
    }

    public static void main(String[] args) {
        String entrada = "Vegetti";
        System.out.println("Maior substring palindrômica: " + maiorPalindromo(entrada));
    }
}

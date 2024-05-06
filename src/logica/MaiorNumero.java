package logica;

public class MaiorNumero {
    public static int encontrarMaior(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array está vazio ou nulo.");
        }
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[] array = {7, 14, 2, 9, 5}; // Podemos alterar os números neste array
        int maiorNumero = encontrarMaior(array);
        System.out.println("O maior número no array é: " + maiorNumero);
    }
}

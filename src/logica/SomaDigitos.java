package logica;

public class SomaDigitos {
    public static int somaDigitos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        int numero = 12345; // Podemos alterar este número para calcular a soma dos dígitos de outro valor
        int resultado = somaDigitos(numero);
        System.out.println("A soma dos dígitos de " + numero + " é: " + resultado);
    }
}

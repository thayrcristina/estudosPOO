package logica;

public class Soma {
    public static int somaPares(int limite) {
        int soma = 0;
        for (int i = 2; i <= limite; i += 2) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        int limite = 10; // Podemos alterar este valor para calcular a soma dos pares até outro limite
        int resultado = somaPares(limite);
        System.out.println("A soma dos números pares até " + limite + " é: " + resultado);
    }
}

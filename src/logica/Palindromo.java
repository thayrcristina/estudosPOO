package logica;

public class Palindromo {

    public static boolean ehPalindromo(String cadeia) {
        String cadeiaNormalizada = cadeia.replaceAll("\\s+", "").toLowerCase();

        String reverso = new StringBuilder(cadeiaNormalizada).reverse().toString();

        return cadeiaNormalizada.equals(reverso);
    }

    public static void main(String[] args) {
        String[] exemplos = {
                "A base do teto desaba",
                "Olá",
                "A man a plan a canal Panama",
                "Socorram-me, subi no ônibus em Marrocos"
        };

        for (String exemplo : exemplos) {
            System.out.printf("\"%s\" é palíndromo? %b%n", exemplo, ehPalindromo(exemplo));
        }
    }
}
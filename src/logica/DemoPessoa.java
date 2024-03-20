package logica;

public class  DemoPessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Thayna", "Rodrigues", "Masculino", 15);

        System.out.println("Seu nome é: " + pessoa.getNome());

        pessoa.idadeMaior();
        pessoa.tipoGenero();
    }
}

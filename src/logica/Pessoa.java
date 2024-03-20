package logica;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String genero;
    private int idade;

    // Constantes para os gêneros
    public static final String GENERO_FEMININO = "Feminino";
    public static final String GENERO_MASCULINO = "Masculino";

    public Pessoa(String nome, String sobrenome, String genero, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.idade = idade;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    // Método para verificar se é maior de idade
    public void idadeMaior() {
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }

    // Método para verificar o tipo de gênero
    public void tipoGenero() {
        if (GENERO_FEMININO.equals(genero)) {
            System.out.println("Você é do gênero feminino");
        } else if (GENERO_MASCULINO.equals(genero)) {
            System.out.println("Você é do gênero masculino!");
        } else {
            System.out.println("Gênero inválido!");
        }
    }
}

public class DemoPessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", "Da Silva", 35, "Maculino", "Solteiro");
        Pessoa pessoa2 = new Pessoa("Maria", "Rosario", 78, "Feminino", "Viuva");

        System.out.println("Nome: " + pessoa.nome + " Sobrenome: " + pessoa.sobrenome + " Idade: " + pessoa.idade + " Genero: " + pessoa.genero + "Estado Civil: " + pessoa.estadoCivil);
        System.out.println(pessoa2.nome);
    }
}

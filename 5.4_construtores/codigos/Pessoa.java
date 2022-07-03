public class Pessoa {

    String nome;
    int idade;

    Pessoa(String nome) {
        this.nome = nome;
        // Inicializacao bem complicada de fazer...
    }

    Pessoa(String nome, int idade) {
        this(nome); // deve ser a primeira instrucao dentro do construtor
        this.idade = idade;
    }

}

package Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokages() { // no args constructor // construtor sem argumentos
    }

    // construtor com todos argumentos all args constructor
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}

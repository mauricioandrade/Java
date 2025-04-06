package Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    Enum TipoHabilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, Enum tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        TipoHabilidade = tipoHabilidade;
    }

    @Override
    public void executarHabilidade() {

    }

    @Override
    public void mostrarInformacoes() {

    }
}

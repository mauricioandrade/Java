package Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String especialidade;
    Enum TipoHabilidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, String especialidade, Enum tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
        TipoHabilidade = tipoHabilidade;
    }

    @Override
    public void executarHabilidade() {

    }

    @Override
    public void mostrarInformacoes() {

    }
}

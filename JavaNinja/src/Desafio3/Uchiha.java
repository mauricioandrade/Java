package Desafio3;

public class Uchiha extends Ninja{

    String habilidadeEspecial;


    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }


    void mostrarInformacoes(){
        System.out.println("Seu nome é: " + nome + "\n Sua idade é: " + idade + "\nSua missão é: " +missao+ "\n Nível de dificuldade da missão: " + nivelDificuldade + "\n Sua missão é: " + missao + "\n Status da missão é: " + statusMissao);
    }
}



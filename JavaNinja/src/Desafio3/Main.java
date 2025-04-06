package Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Recuperar o amuleto";
        sasuke.nivelDificuldade = "Alta";
        sasuke.statusMissao = "Em andamento";
        sasuke.mostrarInformacoes();

    }
}

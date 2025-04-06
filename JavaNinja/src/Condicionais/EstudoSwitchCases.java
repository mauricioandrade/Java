package Condicionais;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
         * SwitchCases: gerar casos especificos.
         * Objetivo: Pedir para usuario escolher entre os ninjas
         * switchcase
         */

        // pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // mostrar opções para o usuario

        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Kakashi Hatake");
        System.out.println("3 - Sasuke Uchiha");

        // pedir para o usuario escolher um

        System.out.println("Escolha um personagem: ");
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Você digitou o número: " + escolhaDoUsuario);


        // reação ao escolher um personagem
        switch (escolhaDoUsuario){
            case 1 :
                System.out.println("Você escolhe o Naruto Uzumaki");
            case 2:
                System.out.println("Você escolheu o Kakashi Hatake");
            case 3:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida, tente novamente!");
        }

        // fechar a caixa
        scanner.close();
    }
}

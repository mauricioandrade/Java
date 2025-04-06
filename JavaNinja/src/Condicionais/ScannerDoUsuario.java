package Condicionais;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
         * Scanner é um jeito de trazer o usuario para dentro da aplicação
         * Objetivo: usuario criar o ninja e nós iremos validar os dados
         */

        // iniciar o scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // receber o nome do ninja
        System.out.println("Escreva aqui o nome do Ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // receber a idade do ninja
        System.out.println("Escreva aqui a idade do seu Ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do Ninja é: " + idadeNinja + " anos");

        // tratamento de dados
        if (idadeNinja >= 18){
            System.out.println("Esse ninja é maior de idade e pode ir para missões fora da aldeia.");
        }else{
            System.out.println("Esse ninja é muito novo, precisa treinar mais antes de sair da vila");
        }

        // fechar o scanner
        caixaDeTexto.close();
    }
}
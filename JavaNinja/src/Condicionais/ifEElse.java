package Condicionais;

public class ifEElse {
    public static void main(String[] args) {

        /* If e Else - Condições
         * Objetivo: passar o ninja de nivel de acordo com o número de missoes
         *
         */

// Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;


// se a (condição) acontecer (faça isso)

        if (numeroDeMissoes >= 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20 && idade > 18) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");

        }
    }
}
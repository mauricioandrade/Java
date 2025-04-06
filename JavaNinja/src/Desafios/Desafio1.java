package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

// Ninja 1
        String ninja1 = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Espiar mulheres com o Jiraiya";
        String statusMissao = "Andamento";
        char nivelMissao = 'S';

// verificar nivel da missao
        if (idade < 15){
            if (nivelMissao == 'C' || nivelMissao =='D'){
                statusMissao ="Missão Conlcuida";
            } else{
                statusMissao ="Não Concluida";
            }
        }else{
            statusMissao = "Concluida";

        }

        System.out.println("-------------------------------------------------");
        System.out.println("Nome do Ninja: " + ninja1);
        System.out.println("idade do Ninja: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Status da Missão: " + statusMissao);
        System.out.println("Nível da Missão: " + nivelMissao);
        System.out.println("-------------------------------------------------");

// Ninja 2
        String ninja2 = "Sasuke Uchiha";
        int idade2 = 17;
        String missao2 = "Lutar contra o time 7";
        String statusMissao2 = "Andamento";
        char nivelMissao2 = 'B';

        if (idade2 < 15){
            if (nivelMissao2 == 'C' || nivelMissao =='D'){
                statusMissao2 ="Missão Conlcuida";
            } else{
                statusMissao2 ="Não Concluida";
            }
        }else{
            statusMissao2 = "Concluida";

        }


        System.out.println("-------------------------------------------------");
        System.out.println("Nome do Ninja: " + ninja2);
        System.out.println("idade do Ninja: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Status da Missão: " + statusMissao2);
        System.out.println("Nível da Missão: " + nivelMissao2);
        System.out.println("-------------------------------------------------");

// Ninja 1
        String ninja3 = "Kakashi Hatake";
        int idade3 = 28;
        String missao3 = "Lutar com Kakuzu";
        String statusMissao3 = "Andamento";
        char nivelMissao3 = 'S';

        if (idade3 < 15){
            if (nivelMissao3 == 'C' || nivelMissao =='D'){
                statusMissao3 ="Missão Conlcuida";
            } else{
                statusMissao3 ="Não Concluida";
            }
        }else{
            statusMissao3 = "Concluida";

        }

        System.out.println("-------------------------------------------------");
        System.out.println("Nome do Ninja: " + ninja3);
        System.out.println("idade do Ninja: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Status da Missão: " + statusMissao3);
        System.out.println("Nível da Missão: " + nivelMissao3);
        System.out.println("-------------------------------------------------");
    }
}
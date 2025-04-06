package NivelBasico;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // arrays são tipo referencia! sem valor string retorna null
        String[] ninjas = new String[5];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuuga";
        ninjas[4] = "Kakashi Hatake";

        System.out.println(ninjas[0]);

        // Redeclarar o array - estamos sobrescrevendo o espaço da memoria, mas estamos usando outro espaço.

        ninjas = new String[7];
        ninjas[0] ="Hashirama Senju";
        ninjas[1] ="Tobirama Senju";
        ninjas[2] ="Hiruzen Sarutobi";
        ninjas[3] ="Minato Namikaze";
        ninjas[4] ="Tsunade";
        ninjas[5] ="Kakashi Hatake";
        ninjas[6] ="Naruto Uzumaki";
        System.out.println(ninjas[2]);

        // FOR PARA FAZER LOOP NO ARRAY
        for (int i = 0; i < 7 ; i++) {
            System.out.println(ninjas[i]);
        }

        // array idade int = sem valor inicializa 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);

        // array com boolean sempre inicia com false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // array float sempre inicia com 0,0 caso não receba valor
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);

    }

}

package Condicionais;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Lacos de repetiçao: vao repetir infinitamente ou até você atingir o parametro desejado
        *  WHILE = FOR
         */

        // While - estrutura while (condicao) tudo vai acontecer

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras");*/



        // FOR
        for (int i = 0; i <= numeroMaximoDeClones ; i++) {
        System.out.println("O naruto está se clonando e já se clonou " + i);

        }
    }


}
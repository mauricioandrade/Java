package Condicionais;

public class Ternarios {
    public static void main(String[] args) {

        /*
         * Ternarios: São maneiras de reduzir o código
         * Variavel = (condição) ? valorSeVerdadeiro : valorSeFalso:
         *
         */

        short numeroDeMisseos = 10;
        String nivel = (numeroDeMisseos >= 10 )? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivel);

    }
}

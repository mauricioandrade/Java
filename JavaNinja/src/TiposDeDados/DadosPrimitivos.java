package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados primitivos - int, Long, double, float, char, boolean, short.
        * INT pode alocar 2,147,483,647, apos isso, devemos utilizar o LONG
        * Long valor maximo 9,223,372,036,854,775,807.
        * Objetivo da aula: criar um ninja - Naruto -
         */

        int idade = 16;
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 99999L;

        System.out.println("Sua idade é : " + idade);
        System.out.println("Seu saldo no banco é : " + "R$ "+ saldoBancario);
        System.out.println("Sua altura é : " + altura);

    }
}

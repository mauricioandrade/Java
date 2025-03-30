package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados não primitivos: String, Array, Class, Enym
        * Objetivo: Criar um ninja e atribuir métodos a ele.
        * Métodos: são caracteristicas que vamos adcionar nas nossas variáveis.
         */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // toUpperCase vai colocar tudo em caps lock

        System.out.println("Esse texto está em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto está normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        aldeia.toLowerCase();
        String aldeiaToLowerCase = aldeia.toLowerCase();
        System.out.println("Esse texto está em LowerCase: " + aldeiaToLowerCase);
        System.out.println("Esse texto está normal : " + aldeia);
    }
}

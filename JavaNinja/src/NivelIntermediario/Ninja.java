package NivelIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;
    int missoes;

    //  criar um metodo público personalizado

    /*
     * Metodo string, deve retornar uma String
     */

    public String euSouUmNinja(){ // metodo string, retornando uma string
        return "Oi, eu sou um ninja";
    }

    /*
    * Metodo int vai retornar um int
     */

    public int missoesParaAnbu(int missoesAnbu){ // saber se está pronto para ser um anbu
        return missoesAnbu - missoes;
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){ // passamos o parametro dentro do parenteses
        return idadeMinimaParaSerHokage - idade;
    }

    }


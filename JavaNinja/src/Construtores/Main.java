package Construtores;

public class Main {
    public static void main(String[] args) {

        Hokages Hashirama = new Hokages("Senju Hashirama", 60, false);
        Hokages Tobirama = new Hokages("Senju Tobirama", 55, false);
        Hokages Hiruzen = new Hokages("Sarutobi Hiruzen", 70, false);
        Hokages Minato = new Hokages("Namikaze Minato", 30, false);
        System.out.println("############################");
        System.out.println("Você foi o Primeiro Hokage: " + Hashirama.nome + "\n sua idade era: " + Hashirama.idade + " anos");
        System.out.println("############################");
    }
}

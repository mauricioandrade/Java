package NivelIntermediario;

public class Main extends Ninja {
    public static void main(String[] args) {

        // Criar o ninja naruto
        System.out.println("****************************");
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konoha";
        Naruto.idade = 18;
        System.out.println("Seu nome é: " + Naruto.nome + "\n sua aldeia é: " + Naruto.aldeia + "\n sua idade é: " + Naruto.idade);
        Naruto.modoSabio();

        // Criar o ninja Sasuke
        System.out.println("****************************");
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia= "Konoha";
        Sasuke.idade= 19;
        System.out.println("Seu nome é: " + Sasuke.nome + "\n sua aldeia é: " + Sasuke.aldeia + "\n sua idade é: " + Sasuke.idade);
        // Aplicando metodos aos meus objetos
        Sasuke.SharinganAtivado();

        System.out.println("****************************");
        Haruno Sakura = new Haruno();
        Sakura.nome = "Haruno Sakura";
        Sakura.aldeia ="Konoha";
        Sakura.idade = 18;
        System.out.println("Seu nome é: " + Sakura.nome + "\n sua aldeia é: " + Sakura.aldeia + "\n sua idade é: " + Sakura.idade);
        Sakura.ninjaMedica();

        System.out.println("****************************");
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hyuuga Hinata";
        Hinata.aldeia ="Konoha";
        Hinata.idade = 18;
        System.out.println("Seu nome é: " + Hinata.nome + "\n sua aldeia é: " + Hinata.aldeia + "\n sua idade é: " + Hinata.idade);
        Hinata.ativarByakugan();

        System.out.println("****************************");
        Ninja Kakashi = new Ninja();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.aldeia= "Konoha";
        Kakashi.idade= 29;
        System.out.println("Seu nome é: " + Kakashi.nome + "\n sua aldeia é: " + Kakashi.aldeia + "\n sua idade é: " + Kakashi.idade);


        System.out.println("****************************");
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia= "Konoha";
        Boruto.idade= 10;
        System.out.println("Seu nome é: " + Boruto.nome + "\n sua aldeia é: " + Boruto.aldeia + "\n sua idade é: " + Boruto.idade);
        Boruto.ativarOKarma();
        Boruto.ativarJougan();


    }
}

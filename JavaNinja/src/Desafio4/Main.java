package Desafio4;

public class Main {
    public static void main(String[] args) {


        NinjaBasico iruka = new NinjaBasico("Iruka", 24, TipoHabilidade.TAIJUTSU);
        NinjaAvancado kakashi = new NinjaAvancado("Hatake Kakashi", 26, "Sharingan", TipoHabilidade.RAIKIRI);
        System.out.println("####################");
        System.out.println("Você é o Ninja Básico: " + iruka.nome + "\n Você tem: " + iruka.idade + " anos" + "\n Sua melhor habilidade é o: " + iruka.TipoHabilidade);
        System.out.println("####################");

        System.out.println("\n####################");
        System.out.println("Você é o Ninja Avançado: " + kakashi.nome + "\n Você tem: " + kakashi.idade + " anos" + "\n Sua habilidade especial é: " + kakashi.especialidade +"\n Sua melhor habilidade é o: " + iruka.TipoHabilidade);
        System.out.println("####################");
    }
}

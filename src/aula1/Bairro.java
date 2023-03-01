package aula1;

public class Bairro {
    public static void main(String[] args) {
        Casa casaDaArvore = new Casa("Amarela", 10, "Luiz Gomez");
        System.out.println(casaDaArvore.getCorDaParede());

        Casa casaDePraia = new Casa("Roxo",  3, "Thatiana Garcia");
        System.out.println(casaDePraia.getCorDaParede());

        Casa casaTosca = new Casa("Vermelho Escuro", 0, "Thiago Sobral");
        System.out.println(casaTosca.getCorDaParede());
        // casaTosca.corDaParede = "Branca";

        Apartamento apart = new Apartamento("Preta", 2, "Rafael Matsuyama");
        System.out.println(apart.getCorDaParede());
    }
}

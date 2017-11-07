package boletin5_6;

public class Boletin5_6 {

    public static void main(String[] args) {
        Artigo artigo1 = new Artigo("patacas", 566);
        if (artigo1.getVendasAnuais() <= 100) {
            System.out.println("Baixo");
        }
        if (artigo1.getVendasAnuais() > 100 && artigo1.getVendasAnuais() <= 500) {
            System.out.println("Medio");
        }
        if (artigo1.getVendasAnuais() > 500 && artigo1.getVendasAnuais() <= 1000) {
            System.out.println("Alto");
        }
        if (artigo1.getVendasAnuais() > 1000) {
            System.out.println("Primeira Necesidade");
        }

    }
}

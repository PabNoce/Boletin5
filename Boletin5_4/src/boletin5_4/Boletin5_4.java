package boletin5_4;

public class Boletin5_4 {

    public static void main(String[] args) {
        Persoa persoa1 = new Persoa("Juan", 75);
        Persoa persoa2 = new Persoa("Marcos", 65);
        if (persoa1.getPeso() > persoa2.getPeso()) {
            System.out.println(persoa1.getPeso());
            System.out.println(persoa1.getPeso() - persoa2.getPeso());
        } else {
            System.out.println(persoa2.getPeso());
            System.out.println(persoa2.getPeso() - persoa1.getPeso());
        }

    }

}

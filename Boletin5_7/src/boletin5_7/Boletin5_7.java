package boletin5_7;

import java.util.Scanner;

public class Boletin5_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadrado cadrado1 = new Cadrado((float) 4.5);
        Circulo circulo1 = new Circulo((float) 2.2);
        Triangulo triangulo1 = new Triangulo((float) 4, (float) 1.3);
        System.out.println("1: Cadrado\n2: Circulo\n3: Triangulo");
        switch (sc.nextLine()) {
            case "1":
                System.out.println(cadrado1.superficie());
                break;
            case "2":
                System.out.println(circulo1.superficie());
                break;
            case "3":
                System.out.println(triangulo1.superficie());
                break;
            default:
                System.out.println("error");
                break;
        }

    }

}

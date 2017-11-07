package boletin5_5;

import java.util.Scanner;

public class Boletin5_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Numero num1 = new Numero(scan.nextInt());
        Numero num2 = new Numero(scan.nextInt());
        Numero num3 = new Numero(scan.nextInt());
        int max;
        max = num1.getNum();
        if (num2.getNum() > max) {
            max = num2.getNum();
        }
        if (num3.getNum() > max) {
            max = num3.getNum();
        }
        System.out.println(max);

    }

}

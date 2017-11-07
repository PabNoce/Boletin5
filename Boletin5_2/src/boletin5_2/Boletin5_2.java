package boletin5_2;

import java.util.Scanner;

public class Boletin5_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short num1 = scan.nextShort();
        short num2 = scan.nextShort();
        if (num1 >= num2) {
            System.out.println(num1 - num2);
        }
        System.out.println(num1 + num2);
    }

}

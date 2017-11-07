package boletin5_3;

import java.util.Scanner;

public class Boletin5_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println("-");
        }
        if (num > 0) {
            System.out.println("+");
        }
        if (num == 0) {
            System.out.println("0");
        }
    }

}

package cz.gyarab.prg.e1.s1;


import java.util.Scanner;

public class Trojuhelnik {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //velikost = sc.nextInt();

        int velikost = 5;

        for (int radek = 0; radek < velikost; radek++) {
            for (int j = 0; j < velikost - radek ; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < radek * 2 + 1 ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int radek = 1; radek < velikost; radek++) {
            for (int j = 0; j < radek +1; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < (velikost-radek) * 2 -1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }


        System.out.println("velikost = " + velikost);
    }
}

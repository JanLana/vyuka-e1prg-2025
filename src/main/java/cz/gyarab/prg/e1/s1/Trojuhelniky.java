package cz.gyarab.prg.e1.s1;

import java.util.Scanner;

public class Trojuhelniky {
    public static void vypisRadekZnaku(int pocetZnaku) {
        for (int k = 0; k < pocetZnaku; k++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public static void vypisOdsazenyRadek(int pocetMezer, int pocetZnaku) {

    }


    public static void vypisTrojuhelnik(int velikost) {
        for (int j = 0; j < velikost; j++) {
            vypisRadekZnaku(j+1);
        }
    }

    public static void vypisCtverec(int velikost) {
        for (int j = 0; j < velikost; j++) {
            vypisRadekZnaku(velikost);
        }
    }

    public static void main(String[] args) {
        //vypisRadekZnaku(1);
        //vypisRadekZnaku(10);
        //System.out.println("test 2:");
        //vypisTrojuhelnik(3);

        Scanner sc = new Scanner(System.in);
        int velikost = sc.nextInt();

        for (int i = 0; i < velikost; i++) {
            vypisTrojuhelnik(velikost);
        }
    }
}

package cz.gyarab.prg.e1.s2;

import java.util.Scanner;

public class Trojuhelnik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int velikost = sc.nextInt();

        int pocetMezer = velikost - 1;
        int pocetKrizku = 1;

        for (int radek = 0; radek < velikost*2-1; radek++) {
            // napis spravny pocet mezer
            for (int i = 0; i < pocetMezer; i++) {
                System.out.print(" ");
            }

            // napis spravny pocet krizku
            for (int i = 0; i < pocetKrizku; i++) {
                System.out.print("#");
            }

            System.out.println();

            if (radek < velikost) {
                pocetMezer = pocetMezer - 1;
                pocetKrizku += 2;
            } else {
                pocetMezer += 1;
                pocetKrizku -= 2;
            }


        }

    }
}

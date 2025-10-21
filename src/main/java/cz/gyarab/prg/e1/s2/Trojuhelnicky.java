package cz.gyarab.prg.e1.s2;

import java.util.Scanner;

public class Trojuhelnicky {
    public static void vypisZnakVicekrat(int pocet) {
        for (int i = 0; i < pocet; i++) {
            System.out.print("#");
        }
    }

    public static void vypisTrojuhelnik(int velikostTrojuhelniku) {
        for (int radek = 0; radek < velikostTrojuhelniku; radek++) {
            vypisZnakVicekrat(radek+1);
            System.out.println();
        }
    }


    public static void vypisCtverec(int velikost) {
        for (int radek = 0; radek < velikost; radek++) {
            vypisZnakVicekrat(velikost);
            System.out.println();
        }
    }













    public static void main(String[] args) {
        //vypisTrojuhelnik(1);
        //System.out.println("------------");
        //vypisTrojuhelnik(3);
        Scanner sc = new Scanner(System.in);
        int velikost = sc.nextInt();

        for (int opakovani = 1; opakovani <= velikost; opakovani++) {
            vypisTrojuhelnik(opakovani);
        }
    }
}

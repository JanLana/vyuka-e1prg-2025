package cz.gyarab.prg.e1.s2;

import java.util.Scanner;

public class VytvorLidi {
    public static void vypisCloveka(Clovek c) {
        System.out.println("jmeno: " + c.jmeno
                + "  prijmeni: " + c.prijmeni
                + "  vek: " + c.vek);
        return;
    }

    public static Clovek vytvorCloveka(String a, String b, int c) {
        Clovek clovek = new Clovek();

        clovek.jmeno = a;
        clovek.prijmeni = b;
        clovek.vek = c;

        return clovek;
    }


    public static void main(String[] args) {
        Clovek neznamy = new Clovek();

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i = sc.nextInt();




        Clovek ja;

        ja = vytvorCloveka("Jan", "Lana", 51);
        /*
        ja = new Clovek();
        ja.jmeno = "Jan";
        ja.prijmeni = "Lana";
        ja.vek = 51;
         */

        Clovek cimrman = new Clovek();
        cimrman.jmeno = "Jara";
        cimrman.prijmeni = "Cimrman";
        cimrman.vek = 115;

        //System.out.println("jmeno: " + ja.jmeno
        //        + "  prijmeni: " + ja.prijmeni
        //        + "  vek: " + ja.vek);

        if (ja.vek < cimrman.vek) {
            vypisCloveka(ja);
        } else {
            vypisCloveka(cimrman);
        }


        vypisCloveka(cimrman);




    }
}

package cz.gyarab.prg.e1.s1;

import java.util.Scanner;

public class PraceSLidmi {
    public static void vypisCloveka(Clovek c) {
        System.out.println("jmeno: " + c.jmeno
                + ", prijmeni: " + c.prijmeni
                + ", vek: " + c.vek);

        return;
    }

    public static Clovek vytvorCloveka(String jmeno, String prijmeni, int vek) {
        Clovek c = new Clovek();
        c.jmeno = jmeno;
        c.prijmeni = prijmeni;
        c.vek = vek;

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Clovek zKlavesnice;
        /*
        zKlavesnice = new Clovek();
        zKlavesnice.jmeno = sc.next();
        zKlavesnice.prijmeni = sc.next();
        zKlavesnice.vek = sc.nextInt();
         */

        zKlavesnice = vytvorCloveka(sc.next(), sc.next(), sc.nextInt());
        vypisCloveka(zKlavesnice);

        Clovek ja;
        Clovek cimrman;

        /*
        ja = new Clovek();
        ja.jmeno = "Jan";
        ja.prijmeni = "Lana";
        ja.vek = 51;
         */
        ja = vytvorCloveka("Jan", "Lana", 51);

        cimrman = new Clovek();
        cimrman.prijmeni = "Cimrman";
        cimrman.jmeno = "Jara";
        cimrman.vek = 115;

        /*
        System.out.println("jmeno: " + ja.jmeno
                + ", prijmeni: " + ja.prijmeni
                + ", vek: " + ja.vek);
         */
        vypisCloveka(ja);
        vypisCloveka(cimrman);



    }
}

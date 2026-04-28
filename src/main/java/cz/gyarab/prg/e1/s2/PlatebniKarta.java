package cz.gyarab.prg.e1.s2;

import java.util.Arrays;

public class PlatebniKarta implements Comparable<PlatebniKarta> {
    String typ;
    int rokPlatnosti;
    String majitel;

    public PlatebniKarta(String typ, int rokPlatnosti, String majitel) {
        this.typ = typ;
        this.rokPlatnosti = rokPlatnosti;
        this.majitel = majitel;
    }

    @Override
    public String toString() {
        return "PlatebniKarta{" +
                "typ='" + typ + '\'' +
                ", rokPlatnosti=" + rokPlatnosti +
                ", majitel='" + majitel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //PlatebniKarta[] poleKaret = new PlatebniKarta[5];
        //poleKaret[0] = new PlatebniKarta("Visa", 2026, "ja");
        //poleKaret[1] = new PlatebniKarta("MasterC", 2026, "ty");
        //...
        PlatebniKarta[] poleKaret = {
                new PlatebniKarta("Visa", 2026, "ja"),
                new PlatebniKarta("MasterC", 2036, "ty"),
                new PlatebniKarta("Visa", 2050, "mama"),
                new PlatebniKarta("Visa", 2030, "deda"),
                new PlatebniKarta("MasterC", 2026, "Strycek Skrblik")
        };

        for (int i = 0; i < 5; i++) {
            System.out.println(poleKaret[i]);
        }

        Arrays.sort(poleKaret);

        System.out.println("");
        System.out.println("==== setrideno ====");
        for (int i = 0; i < 5; i++) {
            System.out.println(poleKaret[i]);
        }



    }

    @Override
    public int compareTo(PlatebniKarta o) {
        /*
        if (rokPlatnosti < o.rokPlatnosti) {
            return -1;
        } else if (rokPlatnosti > o.rokPlatnosti) {
            return 10;
        } else {
            // rokPlatnosti == o.rokPlatnosti
            return 0;
        }
         */
        if (typ.compareTo(o.typ) < 0) {
            return -1;
        } else if (typ.compareTo(o.typ) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

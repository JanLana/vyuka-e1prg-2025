package cz.gyarab.prg.e1.s2;

public class SachovaFigurka {
    String typ;
    boolean jeCerna;
    int radek;
    char sloupec;

    public void inicializace(String t, boolean jeC, int r, char s) {
        typ = t;
        jeCerna = jeC;
        radek = r;
        sloupec = s;
    }

    public void pohniSeDolu() {
        if (radek > 1) {
            radek = radek - 1;
        }
    }



    public void vypisSe() {
        System.out.print("Jsem " + typ);
        if (jeCerna) {
            System.out.print(" černý ");
        } else {
            System.out.print(" bílý ");
        }
        System.out.println("a jsem na pozici " + sloupec + radek);
    }

    public void pohniSeDoprava() {
        //sloupec = (char)((int)sloupec + 1);
        int i = (int)sloupec;
        i = i + 1;
        sloupec = (char)i;
    }
}

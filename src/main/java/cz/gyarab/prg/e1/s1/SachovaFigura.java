package cz.gyarab.prg.e1.s1;

public class SachovaFigura {
    String druh;
    boolean jeBila;
    char sloupec;
    int radek;

    public void inicializujSe(String d, boolean jeB, char s, int r) {
        druh = d;
        jeBila = jeB;
        sloupec = s;
        radek = r;
    }

    public void vypisSe() {
        // vypise promennou f
        System.out.print("Jsem " + druh);
        if (jeBila) {
            System.out.print(" bily ");
        } else {
            System.out.print(" cerny ");
        }
        System.out.println("a stojim na pozici " + sloupec + radek );
    }

    public void pohniSeSmeremDolu() {
        if (radek > 1) {
            radek = radek - 1;
        }
    }

    public void pohniSeDoPrava() {

    }


    public static void main(String[] args) {
        SachovaFigura kun =  new SachovaFigura();
        kun.inicializujSe("kůň", true, 'b', 8);
        kun.vypisSe();
        kun.pohniSeSmeremDolu();
        kun.pohniSeSmeremDolu();
        kun.pohniSeDoPrava();
        kun.vypisSe();

        SachovaFigura pesec1 =  new SachovaFigura();
        pesec1.druh = "pěšec";
        pesec1.jeBila = false;
        pesec1.sloupec = 'a';
        pesec1.radek = 7;

        pesec1.vypisSe();
    }
}

package cz.gyarab.prg.e1.s1.zverinec;

public class Main {
    public static void main(String[] args) {
        Pes pes = new Pes();
        Kocka kocka = new Kocka();

        Zvire[] zvirata = new Zvire[2];
        zvirata[0] = kocka;
        zvirata[1] = pes;


        for (int i = 0; i < zvirata.length; i++) {
            zvirata[i].vypisSe();
        }
    }
}

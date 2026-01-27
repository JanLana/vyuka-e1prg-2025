package cz.gyarab.prg.e1.s1;

public class Zamestnanec extends Clovek {
    Zamestnanec mujSef;

    public Zamestnanec(String j, String pr, int v, Zamestnanec ms) {
        jmeno = j;
        prijmeni = pr;
        vek = v;
        mujSef = ms;
    }

    public void vypisSe() {
        vypisSeClovek();
        System.out.println(" sef: " + mujSef);
    }
}

package cz.gyarab.prg.e1.s1;

public class Clovek {
    String jmeno;
    String prijmeni;
    int vek;

    public void inicializujSe(String j, String p, int v) {
        jmeno = j;
        prijmeni = p;
        vek = v;
    }

    public void vypisSeClovek() {
        System.out.println("Jmeno: " + jmeno + " Prijmeni: " + prijmeni
                + " Vek: " + vek);
    }
}

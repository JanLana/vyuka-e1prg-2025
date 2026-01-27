package cz.gyarab.prg.e1.s2;

public class Lobista extends Clovek {
    String firma;

    public Lobista(String j, String p, int v, String f) {
        jmeno = j;
        prijmeni = p;
        vek = v;
        firma = f;
    }

    public void vypisSe() {
        vypisSeClovek();
        System.out.println("Firma: " + firma);
    }

}

package cz.gyarab.prg.e1.s1;

public class Clovek implements Comparable<Clovek> {
    String jmeno;
    String prijmeni;
    int vek;

    public Clovek() {};

    public Clovek(String jmeno, String p, int v) {
        this.jmeno = jmeno;
        prijmeni = p;
        vek = v;
    }

    public void vypisSeClovek() {
        System.out.println("Jmeno: " + jmeno + " Prijmeni: " + prijmeni
                + " Vek: " + vek);
    }

    @Override
    public int compareTo(Clovek o) {
        String prijmeniDruheho = o.prijmeni;
        int vysledekPorovnani = prijmeni.compareTo(prijmeniDruheho);

        return vysledekPorovnani;
    }
}

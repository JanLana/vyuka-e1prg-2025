package cz.gyarab.prg.e1.s2;

public class Politik extends Clovek {
    String poziceVeVlade;

    public Politik(String j, String p, int v, String pvv) {
        jmeno = j;
        prijmeni = p;
        vek = v;
        poziceVeVlade = pvv;
    }

    public Politik() {};

    public void vypisSe() {
        vypisSeClovek();
        System.out.println("Pozice: " + poziceVeVlade);
    }


}

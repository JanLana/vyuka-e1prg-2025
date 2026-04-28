package cz.gyarab.prg.e1.s2;


public class Pes implements Comparable<Pes> {
    String jmeno;
    String druh;

    public Pes(String jmeno, String druh) {
        this.jmeno = jmeno;
        this.druh = druh;
    }

    @Override
    public int compareTo(Pes kamarad) {
        String rasaKamarada = kamarad.druh;
        int porovnaniDruhu = druh.compareTo(rasaKamarada);

        return porovnaniDruhu;
    }
}

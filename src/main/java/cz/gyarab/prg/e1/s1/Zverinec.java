package cz.gyarab.prg.e1.s1;

public class Zverinec {
    public static void main(String[] args) {
        Pes pesDasenka = new Pes();
        Orel orel = new Orel();
        Pes pesBlesk = new Pes();

        pesDasenka.jmeno = "Dasenka";
        //pasDasenka ma oci = "hneda";

        pesBlesk.jmeno = "Blesk";
        //pesBlesk ma oci "modre"


        orel.jmeno = "Karel";

        pesDasenka.kartaZviete();

        System.out.println("--------------------------");

        orel.kartaZviete();
    }
}

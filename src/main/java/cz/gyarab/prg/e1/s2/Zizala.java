package cz.gyarab.prg.e1.s2;

public class Zizala extends Zvire {
    public String delaZvuk() {
        return "----";
    }

    public int pocetNohou() {
        return 0;
    }

    public void vypisSe() {
        System.out.println(jmeno + " dela zkuk "
                + delaZvuk());
    }
}

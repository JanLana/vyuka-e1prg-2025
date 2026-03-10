package cz.gyarab.prg.e1.s2.zverinec;

public class Kocka extends Zvire  {
    public Kocka(String jmeno) {
        super(jmeno);
    }

    public String delaZvuk() {
        return "mnau";
    }

    @Override
    public int cenaZradla() {
        return 1000;
    }
}

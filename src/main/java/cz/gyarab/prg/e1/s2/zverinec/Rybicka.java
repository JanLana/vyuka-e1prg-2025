package cz.gyarab.prg.e1.s2.zverinec;

public class Rybicka extends Zvire {
    public Rybicka() {
        super("rybicka");
    }

    @Override
    public String delaZvuk() {
        return "bublabla";
    }

    @Override
    public int cenaZradla() {
        return 15;
    }
}

package cz.gyarab.prg.e1.s2.zverinec;

import cz.gyarab.prg.e1.s2.tvary.UmiSeVypsat;

import java.io.Serializable;

public  class Kocka extends Zvire implements UmiSeVypsat {
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

    public void vypisSe() {
        System.out.println("Jsem kocka " + jmeno);
    }

    @Override
    public String vypisJakoString() {
        return "";
    }
}

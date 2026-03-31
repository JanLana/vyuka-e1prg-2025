package cz.gyarab.prg.e1.s1.zverinec;

import cz.gyarab.prg.e1.s1.tvary.UmiSeVypsat;

import java.io.Serializable;

public class Kocka extends Zvire implements UmiSeVypsat, Serializable {
    public String delaZvuk() {
        return "mnau";
    }

    public void vypisSe() {
        System.out.println("jsem kocka a delam " + delaZvuk());
    }
}

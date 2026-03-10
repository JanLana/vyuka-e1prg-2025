package cz.gyarab.prg.e1.s2.zverinec;

import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

public class Pes extends Zvire {
    public Pes(String jmeno) {
        super(jmeno);
    }

    public int cenaZradla() {
        return 2000;
    }

    public String delaZvuk() {
        return "haf";
    }
}

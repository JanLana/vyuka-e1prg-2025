package cz.gyarab.prg.e1.s2.guieditor;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class MojeObsluhaUdalosti implements
        EventHandler<ActionEvent> {
    String jmenoTlacitka;
    Label label;

    public MojeObsluhaUdalosti() { }

    public MojeObsluhaUdalosti(String jmenoTlacitka, Label l) {
        this.jmenoTlacitka = jmenoTlacitka;
        this.label = l;
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Tlačítko: " + jmenoTlacitka);
        label.setText(jmenoTlacitka);
    }
}

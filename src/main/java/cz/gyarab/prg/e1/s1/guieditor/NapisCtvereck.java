package cz.gyarab.prg.e1.s1.guieditor;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;

public class NapisCtvereck implements EventHandler<ActionEvent> {
    TextArea textArea;

    @Override
    public void handle(ActionEvent actionEvent) {
        textArea.appendText("#####\n");
        textArea.appendText("#   #\n");
        textArea.appendText("#####\n");
    }
}

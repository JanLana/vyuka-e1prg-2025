package cz.gyarab.prg.e1.s2.guieditor;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TriTlacitka extends Application {

    @Override
    public void start(Stage primaryStage) {
        //CheckBox cb1 = new CheckBox("1");
        //CheckBox cb2 = new CheckBox("dvojka");
        //CheckBox cb3 = new CheckBox("ja nevim");

        HBox hb = new HBox();

        Label l = new Label("123");
        hb.getChildren().add(l);

        hb.setAlignment(Pos.CENTER);
        for (int i = 0; i < 10; i++) {
            Button btn = new Button("" + i);
            hb.getChildren().add(btn);
        }

        Button btnPlus = new Button("+");
        MojeObsluhaUdalosti obsluhaPlus = new MojeObsluhaUdalosti();
        obsluhaPlus.jmenoTlacitka = "+";
        obsluhaPlus.label = l;
        btnPlus.setOnAction(obsluhaPlus);
        hb.getChildren().add(btnPlus);

        Button btnMinus = new Button("minus");
        btnMinus.setOnAction(new MojeObsluhaUdalosti("minus", l));
        hb.getChildren().add(btnMinus);



        Scene scene = new Scene(hb, 500, 100);

        primaryStage.setTitle("Moje Kalkulacka");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
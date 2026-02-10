package cz.gyarab.prg.e1.s2.guieditor;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Textovnik extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Vytvoření textového pole pro psaní
        TextArea textArea = new TextArea();
        textArea.setPromptText("Sem napiš svůj text...");

        Button btnCtverec = new Button("Ctverec");
        NapisCtverc akce = new NapisCtverc();
        btnCtverec.setOnAction(akce);



        Button btnTroj = new Button("Trojuhelnik");

        VBox tlacitka = new VBox(10);
        tlacitka.getChildren().addAll(btnCtverec, btnTroj);
        tlacitka.setAlignment(Pos.TOP_CENTER);
        tlacitka.setPadding(new Insets(10));

        // Kontejner, který drží textové pole a roztáhne ho na celé okno
        BorderPane root = new BorderPane();
        root.setLeft(tlacitka);
        root.setCenter(textArea);

        // Nastavení scény (velikost okna)
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("Můj JavaFX Textovník");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

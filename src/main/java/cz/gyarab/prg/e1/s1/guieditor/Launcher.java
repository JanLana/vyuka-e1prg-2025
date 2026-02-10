package cz.gyarab.prg.e1.s1.guieditor;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Vytvoření komponenty pro psaní textu
        TextArea textArea = new TextArea();
        textArea.setPromptText("Sem začněte psát svůj text...");


        // 2. Tlačítka (dole)
        Button btnCverecek = new Button("Ctverec");

        NapisCtvereck akce = new NapisCtvereck();
        akce.textArea = textArea;

        btnCverecek.setOnAction(akce);

        Button btnTrojuhelnik = new Button("Trojuhelnik");

        HBox buttonBox = new HBox(10); // Mezera 10px mezi tlačítky
        buttonBox.setPadding(new Insets(10)); // Mezera od okrajů
        buttonBox.setAlignment(Pos.CENTER); // Zarovnání doprava
        buttonBox.getChildren().addAll(btnTrojuhelnik, btnCverecek);

        // Rozvržení (Layout) - StackPane roztáhne textovou oblast na celé okno
        BorderPane root = new BorderPane();
        root.setCenter(textArea);
        root.setBottom(buttonBox);

        // Vytvoření scény (šířka 600, výška 400)
        Scene scene = new Scene(root, 600, 400);

        // Nastavení parametrů okna (Stage)
        primaryStage.setTitle("Můj JavaFX Poznámkový blok");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

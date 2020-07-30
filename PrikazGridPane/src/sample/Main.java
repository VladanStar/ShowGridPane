package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override // Predefinisanje metoda start u klasi Application
    public void start(Stage primaryStage) throws Exception {

        // kreiranje okna i unos njegovih svojstava
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Postavljanje cvorova u okno
        pane.add(new Label("First Name"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("MI: "), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        // kreiranje scene i njeno postavljanje na pozornicu
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Show Grid Pane");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}

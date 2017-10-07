package Zad5;/**
 * Created by nikola3in1 on 4.8.17..
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox ();
        HBox unos = new HBox();
        HBox sort = new HBox();
        TextField ime = new TextField();
        TextField prezime = new TextField();
        TextField god = new TextField();
        TextField pozicija = new TextField();
        unos.getChildren().addAll(ime,prezime,god,pozicija);
        Button submit = new Button("Submit");
        Button sortIme = new Button("Po imenu");
        Button sortprezime= new Button("Po prezimenu");
        Button sortgod = new Button("Po godinama");
        sort.getChildren().addAll(sortIme,sortprezime,sortgod);
        root.getChildren().addAll(unos,submit,sort);


        submit.setOnMouseClicked(mouseEvent -> {
            Zaposleni zaposleni = new Zaposleni(ime.getText(), prezime.getText(), Integer.parseInt(god.getText()), pozicija.getText());
            zaposleni.addToDB();
        });
        sortIme.setOnMouseClicked(mouseEvent -> {
            Zaposleni.printDB(1);
        });
        sortprezime.setOnMouseClicked(mouseEvent -> {
            Zaposleni.printDB(2);
        });
        sortgod.setOnMouseClicked(mouseEvent -> {
            Zaposleni.printDB(3);
        });



        primaryStage.setTitle("Zadatak 4");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}

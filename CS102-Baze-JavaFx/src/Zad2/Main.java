package Zad2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Button add = new Button("add");
        Button delete = new Button("delete");
        Button update = new Button("update");
        Button print = new Button("print");

        TextField ime = new TextField();
        TextField prezime = new TextField();
        TextField proizvodjac = new TextField();
        TextField datum = new TextField();

        HBox line = new HBox();
        line.getChildren().addAll(ime,prezime,proizvodjac,datum);
        root.getChildren().addAll(line, add, update, print, delete);

        add.setOnMouseClicked(mouseEvent -> {
            Baza.addTo(ime.getText(),prezime.getText(),proizvodjac.getText(),datum.getText());
        });

        update.setOnMouseClicked(mouseEvent -> {
            Baza.update(ime.getText(),prezime.getText());
        });

        delete.setOnMouseClicked(mouseEvent -> {
            Baza.delete(ime.getText());
        });

        print.setOnMouseClicked(mouseEvent -> {
            ArrayList<String> lista = Baza.print();
            for (String s: lista){
                root.getChildren().add(new Text(s));
            }

        });
        primaryStage.setScene(new Scene(root,500,400));
        primaryStage.show();
    }
}

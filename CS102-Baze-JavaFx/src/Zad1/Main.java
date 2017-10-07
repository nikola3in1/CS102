package Zad1;

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
        HBox addTo = new HBox();
        VBox display = new VBox();

        TextField ime,prezime,godine,zvanje;
        ime = new TextField();
        prezime = new TextField();
        godine = new TextField();
        zvanje = new TextField();
        addTo.getChildren().addAll(ime, prezime, godine, zvanje);

        Button add = new Button("add");
        Button update = new Button("update");
        Button displayBtn = new Button("display");
        Button deleteBtn = new Button("delete");


        add.setOnMouseClicked(mouseEvent -> {
            Baza.addNew(ime.getText(),prezime.getText(),godine.getText(),zvanje.getText());
        });
        update.setOnMouseClicked(mouseEvent -> {
            Baza.update(ime.getText(),prezime.getText());
        });

        displayBtn.setOnMouseClicked(mouseEvent -> {
            ArrayList<String> print = Baza.print();
            for (String s :
                    print) {
                root.getChildren().add(new Text(s));
            }
        });

        deleteBtn.setOnMouseClicked(mouseEvent -> {
            Baza.delete(ime.getText());
        });








        root.getChildren().addAll(addTo,add,update,displayBtn,deleteBtn,display);


        primaryStage.setScene(new Scene(root,400,300));
        primaryStage.show();

    }
}

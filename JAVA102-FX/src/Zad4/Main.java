package Zad4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane root = new StackPane();
        Button btn = new Button("Download");
        root.getChildren().add(btn);
        btn.setOnMouseClicked(mouseEvent -> {
            ArrayList<Profesor> profesori = Parser.getProfesori();
            for (Profesor p :
                    profesori) {
                System.out.println(p.ime+" "+p.prezime+" "+p.zvanje);
            }
        });

        primaryStage.setTitle("Zadatak 4");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

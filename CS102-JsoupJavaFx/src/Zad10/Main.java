package Zad10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static VBox root = new VBox();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Thread t = new Thread(new Crawl());
        t.start();



        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}

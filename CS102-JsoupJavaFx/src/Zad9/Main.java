package Zad9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static ProgressBar pb;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        pb = new ProgressBar();
        root.getChildren().add(pb);
        Thread t = new Thread(new Crawl());
        t.start();





        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();

    }
}

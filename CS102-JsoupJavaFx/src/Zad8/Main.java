package Zad8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static ProgressBar progressBar;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        progressBar = new ProgressBar();


        Thread t = new Thread(new Crawl());
        t.start();

        VBox root = new VBox();
//        Thread.sleep(2000);

        root.getChildren().add(progressBar);

        primaryStage.setScene(new Scene(root,400,300));
        primaryStage.show();
    }
}

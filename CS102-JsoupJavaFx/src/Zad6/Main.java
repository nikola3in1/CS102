package Zad6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        Thread t = new Thread(new Zad6.Crawl());
        t.start();
        Thread.sleep(10000);

        VBox root = new VBox();

        ArrayList<String> nazivi = Zad6.Crawl.nazivi;
        System.out.println(nazivi.size());
        for (String s : nazivi) {
            root.getChildren().add(new Text(s));
        }


        primaryStage.setScene(new Scene(root,500,300));
        primaryStage.show();

    }
}

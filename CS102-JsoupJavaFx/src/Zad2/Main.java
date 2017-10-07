package Zad2;

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
        Thread t = new Thread(new Crawl());
        t.start();
        VBox root = new VBox();
        Thread.sleep(2000);
        System.out.println(Crawl.program.size());
        ArrayList<String> program = Crawl.program;

        for (String s :
                program) {
            System.out.println(s);
            root.getChildren().add(new Text(s));
        }


        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}

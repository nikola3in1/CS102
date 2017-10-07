package B92;

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
        Thread.sleep(5000);
        ArrayList<String> vesti = Baza.loadVesti();


        for (String s :
                vesti) {
            root.getChildren().add(new Text(s));

        }



        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}

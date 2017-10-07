package Zad1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;

public class Main extends Application {

    final Float[] values = new Float[]{-1.0f, 0f, 0.6f, 1.0f};
    final ProgressBar[] pbs = new ProgressBar[values.length];
//    final ProgressIndicator[] pins = new ProgressIndicator[values.length];

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        HBox box = new HBox();

        final ProgressBar pb = pbs[1] = new ProgressBar();
        Button btn = new Button();

        new Thread()
        {
            public void run() {
                Document doc = null;
                try {
                    doc = Jsoup.connect("http://www.polovniautomobili.com").get();
                    Elements ele = doc.getElementsByClass("price");
                    new Thread(){
                        @Override
                        public void run() {
                            Platform.runLater(new Runnable() {

                                @Override
                                public void run() {
                                    PrintWriter os = null;
                                    try {
                                        os = new PrintWriter("m.txt","UTF-8");

                                    for(int i =1;i<ele.size();i++){

                                        pb.setProgress(100/i);

                                            os.append("\n"+ele.get(i).text());

//                                            os.append("\n"+ele.get(i).text());


                                        System.out.println(ele.get(i).text());
                                    }
                                        os.close();
                                    } catch (FileNotFoundException e) {
                                        e.printStackTrace();
                                    } catch (UnsupportedEncodingException e) {
                                        e.printStackTrace();
                                    }
                                }
                            });

                        }
                    }.start();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();



//        pb.setProgress(values[2]);




//        for (int i = 0; i < values.length; i++) {
//            final Label label = labels[i] = new Label();
//            label.setText("progress:" + values[i]);

//            final ProgressIndicator pin = pins[i] = new ProgressIndicator();
//            pin.setProgress(values[i]);
//            final HBox hb = hbs[i] = new HBox();
//            hb.setSpacing(5);
//            hb.setAlignment(Pos.CENTER);
//            hb.getChildren().addAll(label, pb, pin);
//        }
        root.getChildren().addAll(btn,pb);

        primaryStage.setScene(new Scene(root,400,200));
        primaryStage.show();

    }
}

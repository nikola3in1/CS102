package Zad10;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedList;

public class Crawl implements Runnable{

    @Override
    public void run() {
        try{
            LinkedList<String> slike = new LinkedList<>();
            Document doc = Jsoup.connect("http://www.b92.net/").get();
            Elements ele = doc.select("img");
            System.out.println(ele.size()+"dasdas");
            for (Element e :
                    ele) {
                System.out.println(e.absUrl("src"));
//                slike.add(e.absUrl("src"));
                String url = e.absUrl("src");
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Image img = new Image(url);
                        ImageView imgv = new ImageView(img);
                        imgv.setFitWidth(25);
                        imgv.setFitHeight(22);
                        Main.root.getChildren().add(imgv);
                    }
                });
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

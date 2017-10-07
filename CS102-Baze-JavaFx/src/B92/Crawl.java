package B92;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Crawl implements Runnable {

    @Override
    public void run() {
        try{
            Document doc = Jsoup.connect("http://www.b92.net/").get();
            Elements ele = doc.getElementsByClass("box-item");
            Elements eles = ele.select("h3");
            Baza.connect();
            for (Element e :
                    eles) {
                System.out.println(e.text());
                Baza.addTo(e.text());
            }
            Baza.disconnect();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

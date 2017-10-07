package Zad4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Crawl implements Runnable {
    public static ArrayList<String> nazivi;
    @Override
    public void run() {
        nazivi = new ArrayList<>();
        try{
            Document doc = Jsoup.connect("http://www.kuhinjica.rs/recepti").get();
            Elements ele = doc.getElementsByClass("desktop-article-wrapper");
            Elements eles = ele.select("h3");
            for (Element element :eles
                 ) {
//                System.out.println(element.text());

                nazivi.add(element.text());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

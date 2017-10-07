package Zad1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Crawl {
    public static void crawl(){
        try {
            Document doc = Jsoup.connect("http://www.polovniautomobili.com").get();
            Elements ele = doc.getElementsByClass("price");
            for (Element e :
                    ele) {
                System.out.println(e.text());
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

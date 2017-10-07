package Zad3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Crawl implements Runnable{
    public static ArrayList<String> vesti;
    @Override
    public void run() {
        vesti = new ArrayList<>();
try{
        Document doc = Jsoup.connect("http://www.b92.net/").get();

        Elements ele = doc.getElementsByClass("box-item");
    Elements eles = ele.select(".text");
    for (Element e :
            eles) {
//        System.out.println(e.text());
        vesti.add(e.text());
    }


    } catch (IOException e) {
    e.printStackTrace();
}
    }
}

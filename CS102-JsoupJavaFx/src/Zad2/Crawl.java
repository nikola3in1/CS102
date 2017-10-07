package Zad2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Crawl implements Runnable {
   public static ArrayList program;
    @Override
    public void run() {
        program = new ArrayList();
        try {
            Document doc = Jsoup.connect("http://www.b92.net/").get();
            Elements ele = doc.getElementsByClass("programm");
            Elements e = ele.select("li");
            for (Element element :e
                    ) {
                program.add(element.text());
                        System.out.println(element.text());
//                        System.out.println(element.text());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

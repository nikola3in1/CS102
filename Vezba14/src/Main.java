import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by nikola3in1 on 29.5.17..
 */
public class Main {
    public static void main(String[]args){

        try {
            Document doc = Jsoup.connect("http://www.b92.net/").get();
            Elements elements = doc.select("#tabs-1 > ul.programm > li");

            for (Element e :
                    elements) {
                System.out.println(e.text());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

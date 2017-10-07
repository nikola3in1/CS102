import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by nikola3in1 on 8.5.17..
 */
public class Main {
    public static void main(String []args){
        try{
            Document document = Jsoup.connect("http://www.b92.net/sport/").get();
            Elements elements = document.select(".index:srednjiKursList:tbody_element >");
            for (Element e :
                    elements) {
                System.out.println(e.attr("href"));
                System.out.println(e.html());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Zadatak5 {
    public static void main(String[]args){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.kuhinjica.rs/").get();
            Elements s = doc.select("div#contentWrapper > div.row > div:last-child > div:first-child > div.home-group-wrapper > div.home-single-wrapper > div.home-single-article > h5 ");
            for (Element e :
                    s) {
                System.out.println(s.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(doc);
    }
}

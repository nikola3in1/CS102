package Zad9;

import javafx.application.Platform;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Crawl implements Runnable{

    @Override
    public void run() {
        try{
            Document doc = Jsoup.connect("http://www.kuhinjica.rs/").get();
            Elements ele = doc.select("h1");
            ArrayList<String> naslovi = new ArrayList<>();
            double d = Math.ceil(100 / ele.size());
            double current = Math.ceil(d*2);
            System.out.println(d);
            for (int i =0;i<ele.size();i++) {

                int finalI = i;
                double finalCurrent = current;
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Main.pb.setProgress(finalCurrent/100);
                        System.out.println(d*finalI);
                    }
                });
                naslovi.add(ele.get(i).text());
                current += d;

                Thread.sleep(400);

                System.out.println(ele.get(i).text());
            }

            PrintWriter pw = new PrintWriter("naslovi.txt", "UTF-8");
            for (String s:naslovi) {
                pw.append(s + "\n");
            }
            pw.close();




        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

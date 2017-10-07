package Zad8;

import javafx.application.Platform;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Crawl implements Runnable {
    public static ArrayList<String> paragrafi;
    public static double currentValue=0.0;
    @Override

    public void run() {
        paragrafi = new ArrayList<>();
        try {
            Document doc = Jsoup.connect("http://www.kuhinjica.rs/").get();
            Elements ele = doc.select("p");
            double scaling = 100 / ele.size();

            scaling /= 100;
            System.out.println(scaling);
            int i=0;
            for (i=0;i<ele.size();i++){

                int finalI = i;
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Main.progressBar.setProgress((double)finalI /10);
                    }
                });
                paragrafi.add(ele.get(i).text());
                System.out.println(ele.get(i).text());
                Thread.sleep(500);
            }
            PrintWriter pw = new PrintWriter("paragrafi.txt", "UTF-8");
            for (String s :
                    paragrafi) {
                pw.append(s+"\n");
            }
            pw.close();

//            for (Element e :
//                    ele) {
//                System.out.println(e.text());
//                System.out.println(currentValue);
//                currentValue =(currentValue+ scaling)%100;
//                System.out.println(currentValue%100);
//
//                paragrafi.add(e.text());
//
//
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e1) {
//                    e1.printStackTrace();
//                }
//            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

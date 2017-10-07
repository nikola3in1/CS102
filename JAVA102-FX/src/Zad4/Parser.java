package Zad4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Parser {
    public static ArrayList<Profesor> getProfesori() {
        ArrayList<Profesor> profesori = new ArrayList<>();
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.metropolitan.edu.rs/profesori/fit-profesori/").get();
            Elements elements = doc.getElementsByClass("three_fourth last");
            for (Element e :
                    elements) {
                if (e.text().startsWith("dr")) {
                    String[] imeprezime = e.select("h3").text().split(" ");

                    if (imeprezime.length > 4) {
                        System.out.println(imeprezime[1] + " " + imeprezime[2] + " " + imeprezime[3] + " " + imeprezime[4]);
                    } else {
                        String titula = e.select(":nth-child(2)").text();


                        if (titula.length() > 5 && titula.startsWith("Docent")) {
                            profesori.add(new Profesor(imeprezime[1],imeprezime[2],titula.substring(0,6)));
//                            System.out.println(imeprezime[1] + " " + imeprezime[2] + " " + titula.substring(0, 6));

                        } else if (titula.length() > 17) {
                            profesori.add(new Profesor(imeprezime[1],imeprezime[2],titula.substring(0,17)));
//                            System.out.println(imeprezime[1] + " " + imeprezime[2] + " " + titula.substring(0, 17));
                        } else {
                            profesori.add(new Profesor(imeprezime[1],imeprezime[2],titula));
//                            System.out.println(imeprezime[1] + " " + imeprezime[2] + " " + titula);
                        }
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return profesori;
    }

}

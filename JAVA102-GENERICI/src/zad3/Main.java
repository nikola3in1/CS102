package zad3;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        Firma firma = new Firma();
        Programer nikola = new Programer("nikola", "mitrovic", 20, "junior");
        firma.zaposleni.add(nikola);
        firma.zaposleni.add(new Programer("zarko","mitrovic",16,"junior"));
        firma.zaposleni.add(new Programer("aaaaa","mitrovic",16,"junior"));

        firma.zaposleni.add(new Programer("aaaab","mitrovic",16,"junior"));
        Menadzer m = new Menadzer("nikola", "mitrovic", 16, "FAKS");
        firma.zaposleni.add(new Menadzer("aikola", "mitrovic", 16, "FAKSs"));
        firma.zaposleni.add(m);
        ArrayList<Zaposleni> zaposleni = firma.getIzvestaj(nikola);
        for (Zaposleni z :
                zaposleni) {
            System.out.println(z.ime);
        }
    }
}

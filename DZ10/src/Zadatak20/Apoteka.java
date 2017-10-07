package Zadatak20;

import java.util.ArrayList;

/**
 * Created by nikola3in1 on 16.12.16..
 */
public class Apoteka {
    private String naziv;
    private String adresa;
    private ArrayList<Proizvod> proizvodi;


    public Apoteka() {

    }

    public Apoteka(String naziv,String adresa,Proizvod proizvod) {
        proizvodi = new ArrayList(50);
        this.naziv = naziv;
        this.adresa = adresa;
        proizvodi.add(proizvod);

    }

    public float izracunajCenu(){
        return 1;
    }

}

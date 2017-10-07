package Zadatak20;

/**
 * Created by nikola3in1 on 16.12.16..
 */
public class Proizvod {
    private String naziv;
    private int cena;

    public Proizvod() {
    }

    public Proizvod(String naziv, int cena) {

        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}

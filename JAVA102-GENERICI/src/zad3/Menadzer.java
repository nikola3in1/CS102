package zad3;

public class Menadzer extends Zaposleni{
    public String fakultet;

    public Menadzer(String ime, String prezime, int starost, String fakultet) {
        super(ime, prezime, starost);
        this.fakultet = fakultet;
    }
}

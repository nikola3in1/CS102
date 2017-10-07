package zad3;

public class Programer extends Zaposleni{
    public String zvanje;

    public Programer(String ime, String prezime, int starost, String zvanje) {
        super(ime, prezime, starost);
        this.zvanje = zvanje;
    }
}

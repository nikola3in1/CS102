package zad3;

public class Zaposleni {
    public String ime,prezime;
    public int starost;

    public Zaposleni(String ime, String prezime, int starost) {
        this.ime = ime;
        this.prezime = prezime;
        this.starost = starost;
    }

    public Zaposleni() {
    }

    public String getIme() {

        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }
}

public class Restoran {
    private String naziv,lokacija,radnoVreme,broj;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Restoran{" +
                "naziv='" + naziv + '\'' +
                ", lokacija='" + lokacija + '\'' +
                ", radnoVreme='" + radnoVreme + '\'' +
                ", broj='" + broj + '\'' +
                '}';
    }

    public Restoran() {
    }

    public Restoran(String naziv, String broj, String radnoVreme, String lokacija) {

        this.naziv = naziv;
        this.lokacija = lokacija;
        this.radnoVreme = radnoVreme;
        this.broj = broj;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public String getRadnoVreme() {
        return radnoVreme;
    }

    public void setRadnoVreme(String radnoVreme) {
        this.radnoVreme = radnoVreme;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
}

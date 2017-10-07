package Zadatak20;

/**
 * Created by nikola3in1 on 16.12.16..
 */
public class PrivatnaApoteka extends Apoteka {
    private  Proizvod proizvod;
    public PrivatnaApoteka() {
    }

    @Override
    public String toString() {
        return "PrivatnaApoteka{" +
                "proizvod=" + proizvod.getNaziv()+ " cena="+izracunajCenu()+
                '}';
    }

    public PrivatnaApoteka(String naziv, String adresa, Proizvod proizvod) {
        super(naziv, adresa, proizvod);
        this.proizvod = proizvod;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    @Override
    public float izracunajCenu() {
        float cena = (float)proizvod.getCena();
        return ((20*100) / cena);
    }
}

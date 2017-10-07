package Zadatak20;

/**
 * Created by nikola3in1 on 16.12.16..
 */
public class DrzavnaApoteka extends Apoteka {
    private Proizvod proizvod;
    public DrzavnaApoteka() {
    }

    public DrzavnaApoteka(String naziv, String adresa, Proizvod proizvod) {
        super(naziv, adresa, proizvod);
        this.proizvod = proizvod;
    }

    @Override
    public float izracunajCenu() {
        float cena = (float)proizvod.getCena();
        return  ((5*100) / cena);
    }

    @Override
    public String
    toString() {
        return "DrzavnaApoteka{" +
                "proizvod=" + proizvod.getNaziv() + " cena="+izracunajCenu()+
                '}';
    }
}

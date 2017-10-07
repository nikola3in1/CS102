/**
 * Created by nikola3in1 on 3.4.17..
 */
public class Automobil implements Comparable<Automobil>{
    private String marka;
    private int model;
    private int godiste;

    @Override
    public String toString() {
        return "Automobil{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", godiste=" + godiste +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }



    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public Automobil(String marka, int model, int godiste) {

        this.marka = marka;
        this.model = model;
        this.godiste = godiste;
    }

    @Override
    public int compareTo(Automobil automobil) {
        return Integer.valueOf(automobil.godiste).compareTo(godiste);
    }
}

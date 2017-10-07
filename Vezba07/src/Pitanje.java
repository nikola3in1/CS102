/**
 * Created by nikola3in1 on 3.4.17..
 */
public class Pitanje {
    private String text;
    private String odgovor;


    public Pitanje(String text, String odgovor) {
        this.text = text;
        this.odgovor = odgovor;
    }

    @Override
    public String toString() {
        return "Pitanje{" +
                "text='" + text + '\'' +
                ", odgovor='" + odgovor + '\'' +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(String odgovor) {
        this.odgovor = odgovor;
    }
}

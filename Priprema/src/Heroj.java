/**
 * Created by nikola3in1 on 19.4.17..
 */
public class Heroj {
    private int health;
    private int mana;
    private String ime;
    private  double dmg;

    public Heroj(int health, int mana, String ime, double dmg) {
        this.health = health;
        this.mana = mana;
        this.ime = ime;
        this.dmg = dmg;
    }

    public Heroj(int health, int mana) {
        this.health = health;
        this.mana = mana;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }


    @Override
    public String toString() {
        return "Heroj{" +
                "health=" + health +
                ", mana=" + mana +
                ", ime='" + ime + '\'' +
                ", dmg=" + dmg +
                '}';
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

}

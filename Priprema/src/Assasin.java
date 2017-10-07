/**
 * Created by nikola3in1 on 19.4.17..
 */
public class Assasin extends Heroj {
    private int dps;
    final String weapon = "Dagger";
    public Assasin(int health, int mana, String ime, double dmg) {
        super(health, mana, ime, dmg);
        this.dps = (int) (dmg/health);
    }

    public Assasin(int health, int mana) {
        super(health, mana);
    }


}

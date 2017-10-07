package zadatakBR2;

/**
 * Created by nikola3in1 on 29.1.17..
 */
public class Krug extends GeometrijskiOblik{
    private double r;

    @Override
    public double getZapremina() {
        return -1;
    }

    @Override
    public double getPovrsina() {
        double p=0;
        p = Math.pow(r,2)*Math.PI;
        return p;
    }

    public Krug() {
    }

    public Krug(double r) {

        this.r = r;
    }

    @Override
    public String toString() {
        return "Krug{" +
                "r=" + r +
                '}';
    }
}

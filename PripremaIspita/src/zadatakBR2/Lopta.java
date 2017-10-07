package zadatakBR2;

/**
 * Created by nikola3in1 on 29.1.17..
 */
public class Lopta extends GeometrijskiOblik {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Lopta() {
    }

    public Lopta(double r) {
        this.r = r;
    }

    @Override
    public double getZapremina() {
        double v = 0;
        v = 4/3 * Math.pow(r,3)*Math.PI;
        return v;
    }

    @Override
    public String toString() {
        return "Lopta{" +
                "r=" + r +
                '}';
    }

    @Override
    public double getPovrsina() {
        double p = 0;
        p = 4*Math.pow(r,2)*Math.PI;
        return p;
    }
}

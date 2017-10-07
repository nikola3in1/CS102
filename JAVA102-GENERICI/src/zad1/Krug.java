package zad1;
//o = 2rp
//p = r^2pi
public class Krug extends Oblik2D{
    public int r;

    @Override
    public double povrsina() {
        return Math.pow(r,2)*Math.PI;
    }

    @Override
    public double obim() {
        return 2 * r * Math.PI;
    }

    public Krug(int r) {
        this.r = r;
    }
}

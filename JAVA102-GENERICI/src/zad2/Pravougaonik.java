package zad2;

//o=2a + 2b
//p=ab
public class Pravougaonik extends Oblik2D {
    public int a;
    public int b;

    @Override
    public double obim() {
        return 2 * a + 2 * b;
    }

    public Pravougaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a*b;
    }
}

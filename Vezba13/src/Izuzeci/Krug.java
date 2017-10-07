package Izuzeci;

/**
 * Created by nikola3in1 on 28.12.16..
 */
public class Krug {
    private static int brojac ;
    private double poluprecnik;

    public Krug(double poluprecnik) {
        setPoluprecnik(poluprecnik);
        brojac++;
    }


    public static int getBrojac() {

        return brojac;
    }

    public static void setBrojac(int brojac) {
        Krug.brojac = brojac;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        if(poluprecnik>0){
        this.poluprecnik = poluprecnik;
        }else{
            throw new IllegalArgumentException("poluprecnik ne moze biti negativan");

        }
    }
    public double povrsina(){
        return Math.pow(poluprecnik,2)*Math.PI;
    }
}

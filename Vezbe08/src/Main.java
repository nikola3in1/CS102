/**
 * Created by nikola3in1 on 10.4.17..
 */
public class Main {
    public static void main(String[]args){
        Double[] pocetni = {1.,2.,3.,4.};
        Double[][] niz = GenericUtil.<Double>matrix(pocetni, 4);
        GenericUtil.<Double>ispisiNiz(niz, 4);
    }
}

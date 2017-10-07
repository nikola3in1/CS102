import Izuzeci.Deljenje;
import Izuzeci.Krug;

/**
 * Created by nikola3in1 on 28.12.16..
 */
public class Main {
    public static void main(String[] args){

        try {
        Krug k = new Krug(122);
        Krug k1 = new Krug(1);
        Krug k2 = new Krug(-1);
        }catch(IllegalArgumentException a){
            a.printStackTrace();
        }
    }
}

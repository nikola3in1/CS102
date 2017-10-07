package zadatakBR2;

/**
 * Created by nikola3in1 on 29.1.17..
 */
public class Main {
    public static void main(String[]args){
        Krug k = new Krug(1);
        Lopta l = new Lopta(1);
        System.out.println(k.getPovrsina());
        System.out.println(k.getZapremina());
        System.out.println(l.getZapremina());
        System.out.println(l.getPovrsina());
    }
}

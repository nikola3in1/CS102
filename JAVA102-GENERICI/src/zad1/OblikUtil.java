package zad1;

public class OblikUtil<E> {
    public static <E extends Oblik2D> E uporediP(E a, E b){
        if(a.povrsina()>b.povrsina()){
            return a;
        }else {
            return b;
        }
    }
    public static <E extends Oblik2D> E uporediO(E a, E b){
        if(a.obim()>b.obim()){
            return a;
        }else {
            return b;
        }
    }
}

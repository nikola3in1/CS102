package zad2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        OblikUtil lista = new OblikUtil();
        for (int i=0;i<10;i++){
            lista.add(new Trougao(random.nextInt(20),random.nextInt(20),random.nextInt(20)));
        }

        ArrayList<? extends Oblik2D> a=lista.sortP();
        for (Oblik2D o :
                a) {
            System.out.println(o.povrsina());
        }
    }
}

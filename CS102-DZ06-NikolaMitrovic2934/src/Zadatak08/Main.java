package Zadatak08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nikola3in1 on 7.4.17..
 */
public class Main<E> {

    public Main() {

        E[] aE = (E[]) new Integer[10];
        E[] bE = (E[])new Integer[4];
        for (int i =1; i < 11;i++){
            if(i<5){
                bE[i-1]=(E)new Integer(i);
            }
            aE[i-1]=(E)new Integer(i);
        }


        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        Random random=new Random();
        for (int i =0;i<50;i++){
            a.add(random.nextInt(50));
            b.add(random.nextInt(100));
        }

        System.out.println("Sort");
        GenericUtil.<Integer>sort(a);
        for (Integer i :
                a) {
            System.out.printf(i+",");
        }
        System.out.println("\n\nTransfer & Sort");
        GenericUtil.<Integer>transfer(a,b);
        for (Integer j :
                a) {
            System.out.printf(j+",");
        }

        System.out.println("\n\nShrink & Transfer");
        E[] newBE = GenericUtil.<E>shrinkTransfer(aE,bE,0);
        for (E e :
                newBE) {
            System.out.printf(e+", ");
        }

    }

    public static void main(String args[]){
        new Main();
    }

}

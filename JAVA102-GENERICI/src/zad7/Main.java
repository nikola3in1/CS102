package zad7;

import java.util.ArrayList;
import java.util.List;

public class Main<E,V,N> {
    public Main() {
        List druga=new ArrayList<>();

        druga.add( "asd");
        druga.add( "asd");
        druga.add( "asaaa");
        druga.add( "asd");
        druga.add("asd");
        druga.add( "asd");
        zad7.GenericUtil g = new zad7.GenericUtil();

        druga =g.prosiri(druga,2);
        System.out.println(druga.size());


        int a=1;
        int a1=12;
        int a2=13;
        int a3=14;
        int a4=15;
        E min = (E) g.min(a1,a2,a3,a,a4);

        System.out.println(min);
    }

    public static void main(String[]args){
        new Main();
    }

}

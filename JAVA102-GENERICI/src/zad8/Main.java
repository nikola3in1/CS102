package zad8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        GenericUtil g= new GenericUtil();
        List a = new ArrayList<>();
        List b = new ArrayList<>();
        a.add(12);
        a.add(14);
        a.add(15);
        a.add(11);
        a.add(122);
        b.add(1);
        b.add(1);
        b.add(1);
        b.add(1);
        b.add(1);
        a = g.prebaciMod((ArrayList) a,(ArrayList) b,2);
        for (Object o: a){
            System.out.println(o);
        }

    }
}

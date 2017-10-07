package zad6;

import java.util.ArrayList;

public class Test{
    ArrayList prva = new ArrayList();
    ArrayList druga = new ArrayList();

    public Test() {
        prva = new ArrayList<>();
        druga=new ArrayList<>();

        prva.add( "asd");
        prva.add( "asdda");
        prva.add( "asdaa");
        druga.add( "asd");
        druga.add( "asd");
        druga.add( "asaaa");
        druga.add( "asd");
        druga.add("asd");
        druga.add( "asd");
        GenericUtil g = new GenericUtil();


        System.out.println(g.brojac(druga, new String("asd")));
        druga = (ArrayList) g.prosiri(druga, 50);
        System.out.println(druga.size());

    }


}

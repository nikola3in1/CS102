package zad9;

import java.util.ArrayList;

public class Storage<T> {
    public ArrayList<T>lista;

    public void init(T type){
        System.out.println(type.getClass().getTypeName()+"<");
        lista = new ArrayList<T>();
    }

    public void addToList(T element){
        lista.add(element);
    }

    public ArrayList<String> print(){
        ArrayList<String> ls = new ArrayList<>();

        for (T t :
                lista) {
            System.out.println(t.getClass().getTypeName());
            ls.add(t.toString());
        }

        return ls;
    }

}

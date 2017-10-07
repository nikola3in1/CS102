package zad6;

import java.util.ArrayList;
import java.util.List;

public class GenericUtil<E> {
    public List<E> presek(List<E> prva, List<E> druga) {

        for (int justincase = 0; justincase < prva.size()+druga.size(); justincase++) {
            for (int i = 0; i < prva.size(); i++) {
                for (int j = 0; j < druga.size(); j++) {
                    if (prva.get(i).equals(druga.get(j))) {
                        druga.remove(druga.get(j));
                    }
                }
            }
        }
        return druga;
    }
    public int brojac(List<E> lista, E e){
        int counter=0;
        for (Object o :
                lista) {
            if(o.equals(e))
                counter++;
        }
        return counter;
    }
    public List<E> prosiri(List<E> lista,int size){
        System.out.println(lista.size());
        List<E> newList = new ArrayList<>();
        if(lista.size()<size){
            newList.addAll(lista);
            for (int i =0;i<size;i++){
                E e = null;
                newList.add(e);
            }
        }
        return newList;



    }
}

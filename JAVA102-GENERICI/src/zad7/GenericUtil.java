package zad7;

import java.util.ArrayList;
import java.util.List;

public class GenericUtil<E,N> {
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


    public List<E> prosiri(List<E> lista,int size){
        int razlika=0;
        System.out.println(lista.size());
        List<E> newList = new ArrayList<>();
        if(lista.size()<size){
            razlika=size-lista.size();
            newList.addAll(lista);
            for (int i =0;i<razlika;i++){
                E e = null;
                newList.add(e);
            }
        }else{
            for (int i=0;i<size;i++){
                newList.add(lista.get(i));
            }

        }
        return newList;
    }
    public E min(E...es){
        System.out.println(":::::::::::::::::");
        Number min=0;
        Number a1=0;
        Number a2=0;
        min= (Number) es[0];
        for (int i=0;i<es.length-1;i++){
            a2= (Number) es[i+1];
            if(min.intValue()>a2.intValue()){
                min= a2;
            }
        }
        return (E) min;
    }

}

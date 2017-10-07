package zad8;

import java.util.ArrayList;
import java.util.List;

public class GenericUtil<E> {
    public List<E> sort(ArrayList<E> lista){
        boolean isSorted=false;
        ArrayList<E> novaLista = new ArrayList<>();
        int size=lista.size();
        E max;
        while(!isSorted){
            max = lista.get(0);
            for (int i=0;i<lista.size()-1;i++){
                if(((Number)max).intValue()<((Number)lista.get(i+1)).intValue()){
                    max = lista.get(i+1);
                }
            }
            lista.remove(max);
            novaLista.add(max);
            if(size==novaLista.size()){isSorted=true;}
        }
        return novaLista;
    }
    public List<E> prebaci(ArrayList<E> prva,ArrayList<E> druga){
        druga.addAll(prva);
        return sort(druga);
    }
    public List<E> prebaciMod(ArrayList<E> prva,ArrayList<E> druga, int index){
        int razlika = prva.size() - index;
        int size = druga.size()-1;
        for (int i =0;i<razlika;i++){
            druga.add((E) new Object());
        }
        int j=1;
        for (int i =index; i < prva.size();i++){
            druga.set(size+j,prva.get(i));
            j++;
        }
        return druga;
    }
}

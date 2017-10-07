package zad2;

import java.util.ArrayList;
import java.util.List;

public class OblikUtil<T extends Oblik2D> implements InterfaceUtil {
    public List<T> lista = new ArrayList<T>();


    public void add(T a) {
        lista.add(a);
    }

    public void get() {
        System.out.println(lista.get(lista.size() - 1).getClass());
    }



    @Override
    public ArrayList<T> sortP() {
        boolean isSorted = false;
        ArrayList temp = new ArrayList();
        T max = null;
        int size = lista.size();
        while (!isSorted) {
            max = lista.get(0);
            for (int i = 0; i < lista.size() - 1; i++) {
                if (max.povrsina() < lista.get(i + 1).povrsina()) {
                    max = (T) lista.get(i+1);
                }
            }
            temp.add(max);
            lista.remove(max);

            if (size == temp.size()) {
                isSorted = true;
            }else{
                max=lista.get(0);
            }
        }
        return temp;
    }


    @Override
    public <E extends Oblik2D> ArrayList<? extends Oblik2D> sortO() {
        boolean isSorted = false;
        ArrayList temp = new ArrayList();
        T max = null;
        int size = lista.size();
        while (!isSorted) {
            max = lista.get(0);
            for (int i = 0; i < lista.size() - 1; i++) {
                if (max.obim() < lista.get(i + 1).obim()) {
                    max = (T) lista.get(i+1);
                }
            }
            temp.add(max);
            lista.remove(max);

            if (size == temp.size()) {
                isSorted = true;
            }else{
                max=lista.get(0);
            }
        }
        return temp;
    }
}

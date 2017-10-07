package Zadatak08;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by nikola3in1 on 7.4.17..
 */
public class GenericUtil<E> {
    public GenericUtil() {
    }

    public static <E extends Comparable<E>> void sort(List list) {
        boolean sorted = false;
        E min;
        int j, position = 0;
        while (!sorted) {
            if (position == list.size()) {
                break;
            }
            min = (E) list.get(position);
            for (j = position + 1; j < list.size(); j++) {
                if (min.compareTo((E) list.get(j)) >= 0) {
                    min = (E) list.get(j);
                    list.remove(j);
                    list.add(position, min);
                }
            }
            position++;
            j++;
        }

    }

    public static <E extends Comparable<E>> void transfer(List x, List y) {
        x.addAll(y);
        sort(x);
    }

    public static <E> E[] shrinkTransfer(E[] a, E[] b, int c) {
        int size = b.length + a.length - c;
        E[] oldB = b;
        Class elementType = b.getClass().getComponentType();
        b = (E[]) Array.newInstance(elementType, size);
        for (int i = 0; i < oldB.length; i++) {
            b[i] = oldB[i];
        }
        for (int i = oldB.length; i < b.length; i++) {
            b[i] = a[c];
            c++;
        }
        return b;


    }
}

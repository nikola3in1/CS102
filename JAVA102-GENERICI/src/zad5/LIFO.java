package zad5;

import java.util.ArrayList;
import java.util.List;

public class LIFO<E> {
    List<E> data;
    public LIFO() {data = new ArrayList<>();}
    public void pop(){data.remove(data.size() - 1);}
    public void push(E e){data.add(e);}
    public int size(){return data.size();}
}

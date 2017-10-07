package zad4;

import java.util.ArrayList;
import java.util.List;

public class FIFO<E>{
    List<E> data;
    public FIFO() {
        data=new ArrayList<E>();
    }
    public void enqueue(E e){
        data.add(e);
    }
    public void dequeue() {
        data.remove(0);
    }

    public int size(){
        return data.size();
    }
}

package Zad2;

import java.util.Random;

/**
 * Created by nikola3in1 on 4.8.17..
 */
public class GenericCollection<E> implements AbstractCollection {
    private E[] arr = (E[]) new Object[9];
    private int numOfElements=0;
    public void print(){
        for (int i =0; i <arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    @Override
    public <T> void add(T newItem) {
        E[] newArr = null;
        if(numOfElements>=arr.length){
            newArr = (E[]) new Object[arr.length*2];
        }else{
            newArr = (E[]) new Object[arr.length+1];
        }
        for (int i =0; i <arr.length;i++){
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]= (E) newItem;
        arr=newArr.clone();
        numOfElements++;
    }

    @Override
    public <T> T get(int index) {
        return (T) arr[index];
    }

    @Override
    public void remove(int index) {
        E[] newArr = (E[]) new Object[arr.length-1];
        for (int i =0; i < newArr.length;i++){
            if(i != index){
                newArr[i]=arr[i];
            }
        }
        arr=newArr.clone();
    }


    @Override
    public void shuffle() {
        E[] newArr = (E[]) new Object[arr.length];
        Random rng= new Random();
        for (int i =0; i < newArr.length;i++){
            newArr[i]= arr[rng.nextInt(arr.length)];
        }
        arr = newArr.clone();

    }

    @Override
    public void clear() {
        arr= (E[]) new Object[10];
    }
}

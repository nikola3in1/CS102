package Zad2;

public class Zadatak2 {
    public static void main(String[] args){
        GenericCollection<Integer> a = new GenericCollection<>();
        for (int i=0;i<11;i++){
            a.add(i);
        }
        a.shuffle();
        a.print();

    }
}

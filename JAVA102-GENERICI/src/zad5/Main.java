package zad5;

public class Main {
    public static void main(String[]args){
        LIFO lifo = new LIFO();
        lifo.push("ADSAS");
        lifo.push(12);
        lifo.push(new Object());
        lifo.pop();
        for (Object o :
                lifo.data) {
            System.out.println(o);
        }
    }
}

package zad4;

public class Main {
    public static void main(String[]args){
        FIFO stack = new FIFO();
        stack.enqueue("String");
        stack.enqueue(123);
        stack.enqueue(new Object());
        stack.enqueue('n');

        for (Object o :
                stack.data) {
            System.out.println(o);
        }
        stack.dequeue();
        stack.dequeue();
        stack.dequeue();
        for (Object o :
                stack.data) {
            System.out.println(o);
        }
    }
}

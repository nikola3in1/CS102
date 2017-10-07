package StackTest;

import java.util.Stack;

public class Main {
    public static Stack<Integer> stack1;
    public static Stack<Integer> stack2;
    public static int size=10;
    public static void main(String[]args){

        stack1 = new Stack<>();
        stack2 = new Stack<>();


        for(int i =1;i<11;i++){
            stack1.push(i);
        }



        addToStack(40,2);
        for (int i=0;i<size;i++){
            System.out.println(stack1.pop());
        }



    }


    public static void addToStack(Integer nr, Integer index) {

        for (int i=0;i<size;i++){
            stack2.push(stack1.pop());

        }
        size++;
        for (int j=0;j<size;j++){
         if(j!=index) {

             stack1.push(stack2.pop());
         }else{
             stack1.push(nr);
         }
        }
    }
}

package zad2;
public class zadatak2 {
    public static void main(String[] args){
        System.out.println(rekurzija(1,4,1));
    }

    public static double rekurzija(int x,int n,int step){
        double s=0;
        if(step>n)
            return 1-s*Math.pow(-1,n);

        s = Math.pow(x, step) / factorial(step);
        return s+rekurzija(x,n,step+1);
    }


    public static int factorial(int x){
        int s=0;
        if(x==1)
            return 1;
        s= x*factorial(x-1);
        return s;
    }
}

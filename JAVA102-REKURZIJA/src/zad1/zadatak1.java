package zad1;

public class zadatak1 {
    public static void main(String[] args){
        System.out.println(rekurzija(1,4,1));
    }

    public static double rekurzija(int x, int n,int step){
        double s=0;
        if(step>n)
            return s+1;

        s = Math.pow(x,step)/factorial(step);
        System.out.println(s+" "+step);
        return s+rekurzija(x,n,step+1);
    }

    public static int factorial(int x){
        int s;
        if(x==1)
            return 1;
        s = x * factorial(x-1);
        return s;
    }

}

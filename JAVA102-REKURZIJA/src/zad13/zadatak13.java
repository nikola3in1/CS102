package zad13;

public class zadatak13 {
    public static void main(String[] args){
        System.out.println(rekurzija(1923));;
    }

    public static int rekurzija(int a) {
        return rekurzija(a,0);
    }

    private static int rekurzija(int a, int max) {
        if(a<=0)
            return max;
        int nr=a%10;
        if(nr>max)
            return rekurzija(a/10,nr);
        return rekurzija(a/10, max);
    }
}

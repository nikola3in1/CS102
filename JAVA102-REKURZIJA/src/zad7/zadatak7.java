package zad7;

public class zadatak7 {
    public static void main(String[]args){
        for (int i=1;i<6;i++){
            System.out.println(rekurzija(1234,i));
        }
    }
    public static boolean rekurzija(int d, int n){
        return rekurzija(d,n,0);
    }
    public static boolean rekurzija(Integer d, int n, int pos){
        if(d<1)
            return false;
        if(d%10==n)
            return true;
        d/=10;
        return rekurzija(d,n);
    }
}

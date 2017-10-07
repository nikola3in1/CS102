package zad14;

public class zadatak14 {
    public static void main(String[]args){
        System.out.println(rekurzija(1312,1));
    }

    public static int rekurzija(int a,int b) {
        return rekurzija(a,b,0);
    }

    private static int rekurzija(int a,int b, int out) {
        if(a<=0)
            return invert(out,0);

        int nr=a%10;
        if(nr!=b) {
            out=out*10 +nr ;
            return rekurzija(a/10,b,out);
        }
        return rekurzija(a/10,b,out);
    }

    private static int invert(int a,int out) {
        if(a<=0)
            return out;
        int nr=a%10;
        out=out*10+nr;
        return invert(a/10,out);

    }

}

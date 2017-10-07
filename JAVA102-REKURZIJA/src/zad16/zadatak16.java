package zad16;

public class zadatak16 {
    public static void main(String[]args){
        System.out.println(rekurzija(1234));
    }
    public static int rekurzija(int br){
        return rekurzija(br, 0);
    }
    public static int rekurzija(int br, int out){
        if(br<=0)
            return invert(out);

        int nr=br%10;
        out=out*10+nr;
        if(br%2==0){
            out=out*10;
        }
        return rekurzija(br/10,out);

    }
    public static int invert(int in){
        return invert(in, 0);
    }
    public static int invert(int in,int out){
        if(in<=0)
            return out;

        int nr=in%10;
        out = out * 10 + nr;
        return invert(in / 10, out);
    }
}

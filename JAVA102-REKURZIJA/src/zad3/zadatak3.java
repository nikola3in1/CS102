package zad3;

public class zadatak3 {
    public static void main(String[]args){
        System.out.println(rekurzija(23321,0));
    }
    public static int rekurzija(int in,int out){
        if(in<1)return out;
        out = out *10 + in%10;
        return rekurzija(in/10,out);

    }
}

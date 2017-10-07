package zad9;

public class zadatak9 {
    public static void main(String[]args){
        System.out.println(rekurzija("nikola",1,6));;
    }
    public static String rekurzija(String str,int a,int b){
        return rekurzija(str,a,b,a,"");
    }
    public static String rekurzija(String str,int a,int b,int pos,String out){
        if(b>str.length())
            return null;
        if (pos == b)
            return out;
        out=str.charAt(pos)+  rekurzija(str,a,b,pos+1,out);
        return out;
    }
}

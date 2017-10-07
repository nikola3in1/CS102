package zad8;

public class zadatak8 {
    public static void main(String []args){
        System.out.println(rekurzija("asd","asd"));
    }
    public static boolean rekurzija(String a,String b){
        return rekurzija(a,b,0);
    }
    public static boolean rekurzija(String a,String b,int pos){
        if(a.length()!=b.length())
            return false;
        if(pos == a.length())
            return true;
        if(a.charAt(pos) == b.charAt(pos))
            return rekurzija(a,b,pos+1);
        return false;
    }

}

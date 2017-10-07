package zad10;

public class zadatak10 {
    public static void main(String[]args){
        System.out.println(rekurzija('a',"dsaaasa"));;
    }
    public static int rekurzija(char d,String n){
        return rekurzija(d,n,0,0);
    }
    public static int rekurzija(char d,String n,int sum,int pos){
        if(pos==n.length())
            return sum;
        if(n.charAt(pos)==d)
            sum+=1;

        return rekurzija(d,n,sum,pos+1);
    }
}

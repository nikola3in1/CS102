package Zad1;

public class Zadatak1 {

    public static void main(String[] args){
        int[] niz={2,3,5,8,1};
        System.out.println(suma(niz,0,0));
    }

    public static int suma(int[] niz,int sum,int pos){
        if(pos>=niz.length)return sum;

        if(pos<0) return -1;

        if(niz.length<0) return -1;

        if(pos%2==1){
            sum+=niz[pos];
        }else{
            sum+=niz[pos]/-1;
        }
        return suma(niz, sum, pos+1);
    }
}

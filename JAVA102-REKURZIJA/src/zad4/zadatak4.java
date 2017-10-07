package zad4;

public class zadatak4 {
    public static void main(String[]args){
        int[]a ={1,2,3,4,5,6};
        System.out.println(rekurzija(a,5));
    }
    public static int rekurzija(int[]a, int x){
        return rekurzija(a,x,0);
    }
    public static int rekurzija(int[]a, int x,int pos){
        if(pos ==a.length-1) {
            return 0;
        }
        if(a[pos]==x)
            return pos;

        return rekurzija(a,x,pos+1);
    }
}

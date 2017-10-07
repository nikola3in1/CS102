package zad6;

public class zadatak6 {
    public static void main(String[]args){
        int[][]m={{1,2,3,4},{2,1,3,4},{3,3,3,4},{4,4,4,1}};
        System.out.println(rekurzija(m));
    }
    public static boolean rekurzija(int m [][]){
        return rekurzija(m,0);
    }
    public static boolean rekurzija(int m [][],int x){
        if(x==m.length)return true;

        if(m[x][x]!=0)
            return rekurzija(m,x+1);

        return false;
    }
}

package zad17;

public class zadatak17 {
    public static void main(String[]args){
        int a[]={1,2,3,4};
        int b[]={2,3,4,5};
        int c[] = rekurzija(a, b);
        for (int i :
                c) {
            System.out.println(i);
        }
    }

    public static int[]rekurzija(int[]a,int[]b){
        int[] c = new int[a.length];
        return rekurzija(a, b, c,0);
    }

    public static int[] rekurzija(int[]a,int[]b,int[]out,int pos){
        if(out.length == pos)
            return out;
        out[pos] = a[pos] * b[pos];
        return rekurzija(a, b, out, pos + 1);
    }
}

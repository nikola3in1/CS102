/**
 * Created by nikola3in1 on 20.3.17..
 */
public class Main {
    private static int[][] m= {{1,1,2},{1,2,3},{2,3,3}};
    private static int[] niz = {1,2,3,4,6};
    public static void main(String []args) {
        //pojavljivanja(223312422,9,3);
        System.out.println(simetricnost(m,2,0,1));
    }


    public static int pojavljivanja(int n,int length,int broj){

        if(length==0) {
            return 0;
        }
        else if(n%10 != broj){
            System.out.print(n%10);
        }

            return   pojavljivanja(n/10,length-1,broj);
        }

    public static boolean simetricnost(int[][] m,int n, int i, int j){

        System.out.println("m["+i+"]["+j+"]: "+m[i][j]+" m["+j+"]["+i+"]: "+m[j][i]+"     i: "+i+" j: "+j);
        if(i == n-1 && j ==n) {
            return true;
        }
        if(m[i][j]!=m[j][i]){
            return false;
        }
        if(j<n) {
            return simetricnost(m, n, i, ++j);
        }

        if(i<n)
            return simetricnost(m, n, ++i, j);

        return false;
    }






    public static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
    public static int stepen(int x,int y){
        if(y == 1)
            return x;
        return x * stepen(x,y-1);
    }

    public static boolean isParan(int n){
        if(n == 1)
            return false;
        return !isParan(n-1);
    }
    public static int fibonaciiss(int pos){
        if (pos <= 2)
            return 1;
        return fibonaciiss(pos-1)+fibonaciiss(pos-2);
    }
    public static void suma(int n){
        if(n < 10){
            System.out.println(n);
        }
        else{
            suma(n/10);
            System.out.println(n%10);
        }
    }

    public static int sumaNiza(int[] niz, int n){
        if(n == 0)
            return 0;
        return niz[n-1]+sumaNiza(niz,n-1);
    }
    public static boolean liearnaPretraga(int [] niz, int length, int hit){
        if(length == 0)
            return false;
        if(niz[length-1] == hit)
            return true;
        return liearnaPretraga(niz, length-1, hit);
    }
    public static boolean binSearch(int a[],int l,int d, int x){
        if(l>d)
            return false;
        if(l == d)
            if (a[l]==x)
                return true;
            else
                return false;
        int s = (l+d)/2;
        if(a[s]==x)
            return true;
        if (a[s]>x)
            return binSearch(a, l, s-1, x);
        else
            return binSearch(a, s, d, x);
    }

    public static void bitRepresentation(int n){
        if(n == 0)
            return;
        else {
            bitRepresentation(n/2);
            System.out.print(n%2);
        }
    }
    public static boolean isPalindrome(String s,int l, int d){
        if(l>=d)
            return true;
        if(s.charAt(l)!=s.charAt(d))
            return false;
        return isPalindrome(s,l+1,d-1);
    }
}

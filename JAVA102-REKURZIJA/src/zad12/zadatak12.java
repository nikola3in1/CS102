package zad12;

public class zadatak12 {
    public static void main(String[]args){
        System.out.println(rekurzija(111));;
    }
    public static int rekurzija(Integer a){
        return rekurzija(a,0);
    }
    public static int rekurzija(Integer a,int sum){
        if(a<=0)
            return sum;

        int nr=a%10;
        if(nr%2==0){
            sum+=nr;
            return rekurzija(a/10,sum);
        }

        return rekurzija(a/10,sum);
    }


}

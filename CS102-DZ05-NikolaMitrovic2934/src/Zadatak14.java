
public class Zadatak14 {

    public static void main(String []args) {
        pojavljivanja(142353241,9,3);
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
    
}

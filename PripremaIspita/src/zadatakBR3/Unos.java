package zadatakBR3;

import java.util.Scanner;

/**
 * Created by nikola3in1 on 29.1.17..
 */
public class Unos {
    public Unos() {
        petlja();
    }

    public void petlja(){
        Scanner scanner = new Scanner(System.in);
        int i;
        boolean valid=true;
        while(valid){
            i = scanner.nextInt();
            if(i>0) {
                System.out.println(konverzija(i));
            }
            else{
                System.out.println("Morate unositi brojeve iz skupa N0");
                valid=false;
            }
        }

    }
    public String konverzija(int x){
        String binX="";
        Integer X = 0;
        return  X.toBinaryString(x);
    }
}

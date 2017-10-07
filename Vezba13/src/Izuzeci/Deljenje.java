package Izuzeci;

import java.util.Scanner;

/**
 * Created by nikola3in1 on 28.12.16..
 */
public class Deljenje {
    public Deljenje(){

    }
    public static void setBrojeve(){
        Scanner s = new Scanner(System.in);
        double a,b;
        a = s.nextDouble();
        b = s.nextDouble();
        getBrojeve(a,b);
    }
    public static double getBrojeve(double a, double b){
        System.out.println(a/b);
        return a/b;
    }

}

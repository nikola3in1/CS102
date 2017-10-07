package Datoteke;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by nikola;3in1 on 28.12.16..
 */
public class Main {
    public Main(){
        PrintWriter pw;
        try {
            FileWriter fw;
            fw = new FileWriter("ime.txt",true);
            pw = new PrintWriter("ime.txt");

            pw.println("Nik2ola ");
            pw.println("Mitrovic");
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[]args){
        Stampaj_u_file s = new Stampaj_u_file();
        s.stampaj();
    }
}

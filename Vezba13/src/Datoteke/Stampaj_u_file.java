package Datoteke;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by nikola3in1 on 28.12.16..
 */
public class Stampaj_u_file {

    public void stampaj(){
        try {
            FileWriter fw;
            fw = new FileWriter("data.txt",true);
            PrintWriter pw = new PrintWriter("data.txt");
            for (Integer i =0; i<=10;i++){
                fw.write(i.toString());
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

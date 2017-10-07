import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        new Main();
    }

    public Main() {
        ArrayList<Student> lista = null;
        Scanner input= new Scanner(System.in);
        String smer = input.next();
        Baza.connect();

        if(smer.compareTo("SE")==0){
            lista = Baza.getAllUsers(1);

        }else if(smer.compareTo("IT")==0){
            lista = Baza.getAllUsers(2);

        }
        else if(smer.compareTo("RI")==0){
            lista = Baza.getAllUsers(3);

        }
        for (Student student:
                lista) {
            System.out.println(student.toString());
        }
        Baza.disconnect();
    }
}

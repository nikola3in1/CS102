package zadatakBR4;

/**
 * Created by nikola3in1 on 29.1.17..
 */
public class Main {
    public static void main(String[]args){
        Vector v = new Vector();
        v.writeBin(v.sort(v.readTxt("Neuredjeni.txt")));
        Vector v1 = new Vector();
        v.writeTxt(v1.readBin("Uredjeni.txt"));
    }
}

package zadatakBR4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nikola3in1 on 29.1.17..
 */
public class Vector {
    private int dimenzija;
    private double podatak;

    public Vector() {
    }

    public Vector(int dimenzija, double podatak) {

        this.dimenzija = dimenzija;
        this.podatak = podatak;
    }


    public int getDimenzija() {
        return dimenzija;
    }

    public void setDimenzija(int dimenzija) {
        this.dimenzija = dimenzija;
    }

    public double getPodatak() {
        return podatak;
    }

    public void setPodatak(double podatak) {
        this.podatak = podatak;
    }

    public ArrayList<Double> readBin(String file){
        ArrayList<Double> arrayList = new ArrayList<>(500);
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("Uredjeni"));
            while(in.available()>0){
                arrayList.add(in.readDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }


    public void writeTxt(ArrayList<Double> arrayList){
        PrintWriter pw;

        try {
            pw = new PrintWriter("Uredjeni.txt");
            for(Double d : arrayList){
                pw.write(d.toString()+'\n');
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeBin(ArrayList<Double> arrayList){
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("Uredjeni",true));
            for(Double d:arrayList){
                out.writeDouble(d);
            }
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Double> readTxt(String file){
        String s;
        ArrayList<Double> vektori = new ArrayList<>(500);
        Double vec = null;
        try {
            BufferedReader fr = new BufferedReader(new FileReader(file));
            while((s = fr.readLine()) != null){
                vec = vec.parseDouble(s);
                vektori.add(vec);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vektori;
    }

    public static ArrayList<Double> sort(ArrayList<Double> arrayList){
        Double[] d = new Double[arrayList.size()];
        arrayList.toArray(d);
        Arrays.sort(d);
        ArrayList<Double> sorted= new ArrayList<>(arrayList.size());
        for(double dou : d){
            sorted.add(dou);
        }
        return sorted;
    }
}

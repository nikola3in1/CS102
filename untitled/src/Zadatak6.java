/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.util.Map.Entry;
/**
 *
 * @author sm
 */
public class Zadatak6 {

    List<Student> listaStudenata = new ArrayList<Student>();
    Map<Integer, ArrayList<PolozeniIspit>> mapa = new HashMap<Integer, ArrayList<PolozeniIspit>>();
    ArrayList<PolozeniIspit> pi1 = new ArrayList<>();
    ArrayList<PolozeniIspit> pi2 = new ArrayList<>();
    ArrayList<PolozeniIspit> pi3 = new ArrayList<>();

    public static void main(String[] args) {
        new Zadatak6();

    }

    public Zadatak6() {

        PolozeniIspit student1I1 = new PolozeniIspit("CS102", 9);
        PolozeniIspit student1I2 = new PolozeniIspit("CS103", 6);
        PolozeniIspit student1I3 = new PolozeniIspit("CS100", 8);
        pi1.add(student1I1);
        pi1.add(student1I2);
        pi1.add(student1I3);
        Student student1 = new Student("Jovan", "Lambert", 3051);
        mapa.put(student1.getBrojIndeksa(), pi1);
        PolozeniIspit student2I1 = new PolozeniIspit("CS102", 7);
        PolozeniIspit student2I2 = new PolozeniIspit("CS103", 6);
        pi2.add(student2I1);
        pi2.add(student2I2);
        Student student2 = new Student("Danijel", "Dabovic", 2568);

        mapa.put(student2.getBrojIndeksa(), pi2);
        PolozeniIspit student3I1 = new PolozeniIspit("CS102", 9);
        PolozeniIspit student3I2 = new PolozeniIspit("CS323", 10);
        PolozeniIspit student3I3 = new PolozeniIspit("MA102", 8);
        PolozeniIspit student3I4 = new PolozeniIspit("MA101", 9);
        PolozeniIspit student3I5 = new PolozeniIspit("CS220", 10);

        pi3.add(student3I1);
        pi3.add(student3I2);
        pi3.add(student3I3);
        pi3.add(student3I4);
        pi3.add(student3I5);
        Student student3 = new Student("Simon", "Vilotijevic", 3023);
        mapa.put(student3.getBrojIndeksa(), pi3);
        listaStudenata.add(student1);
        listaStudenata.add(student2);
        listaStudenata.add(student3);




        for (int i =0; i<listaStudenata.size()-1;i++){
            double prosek = 0;
            ArrayList<Student> sortirani = new ArrayList<>(listaStudenata.size());
            for (Entry<Integer, ArrayList<PolozeniIspit>> ispit : mapa.entrySet()) {



                if(racunajProsjecnuOcjenuStudenta(ispit.getValue(), listaStudenata.get(i)) > racunajProsjecnuOcjenuStudenta(ispit.getValue(), listaStudenata.get(i+1))){
                }else{

                    sortirani.add(listaStudenata.get(i));
                }

                for (Student s :
                        sortirani) {

                    prosek = racunajProsjecnuOcjenuStudenta(ispit.getValue(), s);
                    System.out.println("Student: " + s+ "    "+prosek);
                    System.out.println("Polozeni ispiti:");
                    System.out.println(ispit.getValue());
                }



//                prosek = racunajProsjecnuOcjenuStudenta(ispit.getValue(), s);


//                if (ispit.getKey().equals(s.getBrojIndeksa()) && racunajProsjecnuOcjenuStudenta(ispit.getValue(), s) >= prosek) {
//                    System.out.println("Student: " + s + "    "+prosek);
//                    System.out.println("Polozeni ispiti:");
//                    System.out.println(ispit.getValue());
//                    prosek = racunajProsjecnuOcjenuStudenta(ispit.getValue(), s);
//
//                }

            }
        }
        System.out.println("________________________");

    }

    public static double racunajProsjecnuOcjenuStudenta(ArrayList<PolozeniIspit> pi, Student s) {
        int suma = 0;
        for (Iterator<PolozeniIspit> iterator = pi.iterator(); iterator.hasNext();) {
            PolozeniIspit next = iterator.next();
            suma += next.getOcjena();

        }
        return suma / pi.size();

    }

//    @Override
//    public int compareTo(Student o) {
//
//    }

}

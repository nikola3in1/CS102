package zad3;

import java.util.ArrayList;
import java.util.List;

public class Firma<T extends Zaposleni> {
    List<T> zaposleni;

    public Firma() {
        zaposleni = new ArrayList<>();
    }

    public ArrayList<T> getIzvestaj(T type) {
        System.out.println(zaposleni.size());
        boolean isSorted = false;
        ArrayList<T> backup = new ArrayList<>();
        backup.addAll(zaposleni);
        ArrayList<T> temp = new ArrayList<>();
        int size = getNumOfType(type);
        T max;
        while (!isSorted) {

            max= zaposleni.get(0);
            for (int i = 0; i < zaposleni.size() -1; i++) {
                if (max.getClass() == type.getClass()) {
                    if (max.ime.charAt(0) > zaposleni.get(i + 1).ime.charAt(0)) {
                        max = zaposleni.get(i + 1);
                    } else if (max.ime.charAt(0) == zaposleni.get(i + 1).ime.charAt(0)) {
                        for (int j = 1; j > max.ime.length(); i++) {
                            if (max.ime.charAt(i) < zaposleni.get(i + 1).ime.charAt(i)) {
                                max = zaposleni.get(i + 1);
                                break;
                            } else if (max.ime.charAt(i) < zaposleni.get(i + 1).ime.charAt(i)) {
                                break;
                            }
                        }
                    }
                }
            }
            if(max.getClass()==type.getClass()){
                temp.add(max);
            }
            if(size==temp.size()){
                isSorted=true;
            }
            zaposleni.remove(max);

        }
        zaposleni.clear();
        zaposleni.addAll(backup);
        return temp;
        }


        private int getNumOfType(T t){
            int size=0;
            for (Zaposleni zap:
                    zaposleni) {
                if(zap.getClass() == t.getClass()){
                    size++;
                }

            }
            return size;
        }
    }

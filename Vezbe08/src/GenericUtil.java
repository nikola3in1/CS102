import java.util.ArrayList;

public class GenericUtil {

    public GenericUtil() {

    }

    public static <E> void obrisiElemente(ArrayList<E> pregled, ArrayList<E> brisanje) {

        for(int i = 0;i<brisanje.size();i++){
            if(!(pregled.contains(brisanje.get(i)))){
                brisanje.remove(i);
                i--;
            }
        }

    }

    public static <E> ArrayList<Integer> indeksi(ArrayList<E> pregled, E o) {
        ArrayList<Integer> indeksi = new ArrayList<>();
        for (int i = 0; i < pregled.size(); i++) {
            if (pregled.get(i) == o) {
                indeksi.add(i);
            }
        }
        return indeksi;
    }


    public static <E extends Number> E[][] matrix(E[] niz,int x){
        E[][] matrix = (E[][])new Double[x][x];
        for(int i = 0;i<1;i++){
            for(int j = 0;j<x;j++){
                matrix[i][j] =niz[j];
            }
        }
        for(Integer i = 1;i<x;i++){
            for(Integer j = 0;j<x;j++){
                matrix[i][j]= (E)(Double)Math.pow((Double) matrix[i-1][j],2);
                //matrix[i][j] = stepen(matrix[0][j],(E)i+1);
            }
        }
        return matrix;
    }

    public static <E extends Number> int stepen(E o,int x){
        if(x==0)
            return o.intValue();
        return o.intValue()*stepen(o,x-1);
    }

    public static <E> void ispisiNiz(E[][] niz, int x){
        for(int i = 0;i<x;i++){
            for(int j = 0;j<x;j++){
                System.out.print(niz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
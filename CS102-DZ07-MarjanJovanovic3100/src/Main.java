import java.util.ArrayList;

public class Main {
    public Main() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(new Integer(4));
        lista.add(new Integer(5));
        lista.add(new Integer(6));
        lista.add(new Integer(7));
        lista.add(new Integer(8));
        lista.add(new Integer(9));
        lista.add(new Integer(10));
        ArrayList<Integer> b = podskup(lista, 5);
        for (Integer i :
                b) {
            System.out.printf(i + ", ");
        }
    }

    public static void main(String[] args) {
        new Main();
    }

    public ArrayList<Integer> podskup(ArrayList lista, Integer x) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (x > (int) lista.get(i)) {
                temp.add((Integer) lista.get(i));
            }
        }
        return temp;
    }
}

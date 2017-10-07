import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nikola3in1 on 8.4.17..
 */
public class Main {
    public Main() throws InterruptedException {
        ArrayList<Double> lista = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            lista.add(random.nextDouble());
        }
        sortiranje(lista);
        for (Object o
                : lista) {
            System.out.print(String.format("%.2f", o) + ", ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Main();
    }

    public static ArrayList<Double> sortiranje(ArrayList list) {
        ArrayList<Double> temp = new ArrayList(list.size());
        boolean sorted = false;
        Double min = 0.9;
        int j, position = 0;
        while (!sorted) {
            if (position == list.size()) {
                break;
            }
            min = (Double) list.get(position);
            for (j = position + 1; j < list.size(); j++) {
                Double temp1;
                if (Math.min(min, (double) list.get(j)) == (double) list.get(j)) {
                    min = (Double) list.get(j);
                    list.remove(j);
                    list.add(position, min);
                }
            }
            position++;
            j++;
        }
        return list;
    }

}

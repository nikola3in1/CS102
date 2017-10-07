import java.util.ArrayList;

/**
 * Created by nikola3in1 on 3.4.17..
 */
public class StackIgar {
    private ArrayList<Pitanje> stack;
    public void push(Pitanje pitanje){
        stack.add(pitanje);
    }
    public void pop(Pitanje pitanje){
        stack.remove(stack.size()-1);
    }
}

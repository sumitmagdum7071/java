import java.util.ArrayList;
import java.util.function.Consumer;


public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer>numder =  new ArrayList<Integer>();
        numder.add(5);
        numder.add(9);
        numder.add(8);
        Consumer<Integer>method = (n)->{System.out.println("n");};
        numder.forEach(method);
    }
    
}

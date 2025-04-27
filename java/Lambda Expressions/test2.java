
import java.util.ArrayList;
import java.util.function.Consumer;
public class test2{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method =(e)->{System.out.println(e);};
        numbers.forEach(method);
    }
}

package collectionJava;
import java.util.ArrayList;
import java.util.Spliterator;
public class SpliteratorExample {

    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list.add(100.5);
        list.add(200.75);
        list.add(300.25);
        list.add(400.0);

        System.out.println("content of arraylist using tryadvance");
        Spliterator<Double> sitr=list.spliterator();
        while(sitr .tryAdvance((n)->System.out.println(n+" ")));
        System.out.println();
        System.out.println("content of arraylist using for each remaining:");
        sitr=list.spliterator();
        sitr.forEachRemaining((n)->System.out.println(n+" "));
        System.out.println();
        System.out.println("the size of array:"+list.size());
        
    }
}
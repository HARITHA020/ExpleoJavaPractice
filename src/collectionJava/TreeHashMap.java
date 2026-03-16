package collectionJava;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeHashMap {
    public static void main(String[] args) {

        TreeMap<String, Double> tree = new TreeMap<>();

        System.out.println("Size of the TreeMap is: " + tree.size());

        tree.put("Anushiya", 5553225.52);
        tree.put("John", 100.7);
        tree.put("Jane", 1450.78);
        tree.put("Haritha", 145.23);

        System.out.println("Elements in the TreeMap: " + tree);

        System.out.println("Size of the TreeMap is: " + tree.size());

        Set<Map.Entry<String, Double>> set = tree.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }
}
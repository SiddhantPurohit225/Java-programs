package JavaCollections.TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicExp {
    public static void main(String[] args) {
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(1, 100);
        m.put(2, 200);
        m.put(3, 400);
        m.put(-1, 1100);

        
        System.out.println(m);


        Set<Map.Entry<Integer, Integer>> entrySet = m.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet) {
            Integer key = entry.getKey();   
            Integer value = entry.getValue(); 
            System.out.println("Key: " + key + "Value: " + value);
        }
    }
}

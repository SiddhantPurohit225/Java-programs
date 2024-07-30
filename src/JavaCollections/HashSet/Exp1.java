package JavaCollections.HashSet;

import java.util.HashSet;

public class Exp1 {
    
    public static void main(String[] args) {
        HashSet<Integer> h= new HashSet();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);

        h.add(7);
        h.add(null);
        h.remove(3);
        System.out.println(h.add(1)); //returns false and no compiler error
        System.out.println(h);
    }
    

}

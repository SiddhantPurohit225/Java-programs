package JavaCollections.TreeSet;

import java.util.TreeSet;

public class TreeSetExp1 {
    
    public static void main(String[] args) {
        TreeSet<Integer> ts= new TreeSet<>();

        System.out.println("Is treeset empty:" + ts.isEmpty());
        
        ts.add(1);
        ts.add(10);
        ts.add(100); //ignores duplicate
        ts.add(100);
        ts.add(-1);
        ts.add(-100);
        System.out.println(ts); //returns in sorted order

        System.out.println("Smallest elem: " + ts.first());
        System.out.println("largets elem: " + ts.last());
        System.out.println("Number of elems in the tresset: " + ts.size());
        Integer ceil=(Integer)ts.ceiling(5);
        Integer lower=(Integer)ts.lower(5);
        System.out.println(ceil + " " +lower);
    }
}

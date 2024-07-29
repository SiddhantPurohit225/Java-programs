package JavaCollections.ArrayList;
import java.util.*;

public class ArrayListExp1 {
    
public static void main(String[] args) {
    ArrayList l=new ArrayList();

    l.add(1);
    l.add("hello");
    l.add("A");
    l.add(null);

    System.out.println(l);

    l.remove(2);
    System.out.println(l);

    //add at specific index:
    l.add(2,"Index3");
    System.out.println(l);

    // ArrayList l1=new ArrayList(Collection c);

}
   
}

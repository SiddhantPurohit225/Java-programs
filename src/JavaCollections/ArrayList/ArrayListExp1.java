package JavaCollections.ArrayList;
import java.util.*;

public class ArrayListExp1 {
    
public static void main(String[] args) {
    ArrayList<Integer> l=new ArrayList();

    l.add(1);
    l.add(10);
    l.add(-1);
    // l.add(null);
    Collections.sort(l);  
    System.out.println(l);

    l.remove(2);
    System.out.println(l);

    //add at specific index:
    l.add(2,23);
    System.out.println(l);

    // ArrayList l1=new ArrayList(Collection c);

    ListIterator<Integer> ltr= l.listIterator();
    while(ltr.hasNext())
    {
        System.out.println(ltr.next());
    }

    l.forEach(e->{
        System.out.println(e);
    });

}
   
}

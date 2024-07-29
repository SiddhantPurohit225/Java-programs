package JavaCollections.Cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExp {
    
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
    
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        ListIterator ltr= l.listIterator();

        System.out.println(l);
        System.out.println("_______________________");
        while(ltr.hasNext())
        {
            Integer curr = (Integer)ltr.next();

            if(!ltr.hasPrevious())
            {
                System.out.println("I am the first elem");
            }
            if(curr.equals(1))
            {
                ltr.set(01);
            }
            else if(curr.equals(2))
            {
                ltr.add(20);
            }
            else if(curr.equals(3))
            {
                ltr.remove();
            }
        }

        System.out.println(l);
    }
   
}

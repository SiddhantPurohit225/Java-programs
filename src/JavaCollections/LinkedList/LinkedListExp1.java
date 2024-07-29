package JavaCollections.LinkedList;

import java.util.LinkedList;

public class LinkedListExp1 {
    
    public static void main(String[] args) {
        
        
        LinkedList l=new LinkedList();
        l.add("FirstElem");
        //supporting hete data
        l.add(2);
        l.add("FirstElem2");
        l.add("FirstElem3");
        l.add("FirstElem4");

        //Methods of Collection interface works:
        l.set(1,"replacedElem");
        System.out.println(l);

        //since linked list supports queue and stack implemetation we have some methods of stack and 
        //queues:
        l.removeFirst();
        l.addFirst("I am new First elem");

        System.out.println(l);
        
    }
    
}

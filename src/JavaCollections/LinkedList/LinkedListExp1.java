package JavaCollections.LinkedList;

import java.util.LinkedList;

public class LinkedListExp1 {
    
    public static void main(String[] args) {
        
        
        LinkedList<String> l=new LinkedList();
        l.add("FirstElem");
        //supporting hete data
        l.add("Second");
        l.add("ThridElem2");
        l.add("ForthElem3");
        l.add("FifthElem4");

        //Methods of Collection interface works:
        l.set(1,"replacedElem");
        System.out.println(l);

        //since linked list supports queue and stack implemetation we have some methods of stack and 
        //queues:
        l.removeFirst();
        l.addFirst("I am new First elem");
        //indexing starts from 0

        System.out.println("Index of FifthElem4 is : "+l.indexOf("FifthElem4"));
        System.out.println(l);
        
    }
    
}

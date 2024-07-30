package JavaCollections.Basics;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

 class LinkedListIteratorExample 

{    public static void main(String[] args) 
    
    {       
        LinkedList<String> linkedList = new LinkedList<>();     
        linkedList.add("abc");
        linkedList.add("def");
        linkedList.add("efg");
        linkedList.add("hih");     
        System.out.println("Using Iterator:");

        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }        
        
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext())
         {
            String element = listIterator.next();
            System.out.println(element);            
            if (element.equals("def")) {
                listIterator.remove();
            }

        }    
        
        listIterator.add("okk");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }
    }
}
package JavaCollections.Basics;
import java.util.*;

class LinkedList1
 {    
    public static void main(String[] args) 
    {        
        LinkedList<String> linkedList = new LinkedList<>();  
        linkedList.add("java");
        linkedList.add("python");
        linkedList.add("C++");   
        linkedList.push("abc"); 
        linkedList.offer("def");
        linkedList.offerFirst("rrf");
        String firstElement = linkedList.get(0);
        String secondElement = linkedList.get(1);
        linkedList.remove(2);        
        boolean containsPython = linkedList.contains("abc");       
        int size = linkedList.size();      
        linkedList.clear(); 
        boolean isEmpty = linkedList.isEmpty();
    }
}
package JavaCollections.Vectors;

import java.util.LinkedList;
import java.util.Vector;

public class Example1 {
    
    public static void main(String[] args) {

        //a vector of inital capaciy 10 is created
        Vector v=new Vector();

        System.out.println(v.capacity()); //10

        //adding 11 elem then new cap=2*currentCapacity

        for(int i=0;i<v.capacity()+1;i++){
            if(i==11)break;
            v.addElement(i);
        
        }
        System.out.println(v.capacity()); //20
        System.out.println(v.size());//11

        System.out.println("_____________________");
        //vector with given initial capacity and incremental value:
        
        Vector v1= new Vector(100,10);
        System.out.println(v1.capacity());//100
        for(int i=0;i<v1.capacity()+1;i++){
            if(i==101)break;
            v1.addElement(i);
            
            
        }
        System.out.println(v1.capacity()); //110
        System.out.println(v1.size());//101


    //removing elem from vector:
    
    v.removeElement(2);
    System.out.println(v);
    
    //get the laste element:
    System.out.println(v.lastElement());

    System.out.println("_____________________");

    //converting any collection into vector
    LinkedList l=new LinkedList();
    l.add(1);
    l.add(2);
    l.add(1);
    l.add(1);
    
    Vector vec= new Vector(l);
    System.out.println(vec);
    }

    


}

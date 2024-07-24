package JavaCollections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


 class AutoBoxing
{   
     public static void main(String[] args) {  
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt;
        int unboxedInt = boxedInt;      
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); 
        int firstElement = arrayList.get(0);   
             
        List<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        double firstDouble = linkedList.get(0);
    }
}
package JavaCollections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exp1 {
    
    public static void main(String[] args) {
        
        HashMap<Integer,String> m=new HashMap<>();

        m.put(1,"Abc");
        m.put(2,"Abc");
        m.put(-1,"Abc");
        m.put(1,"pop"); //replaces the the exsisting


        //creating set for each entry in map to iterate over it:

        Set<Map.Entry<Integer,String>> sE= m.entrySet();

        for(Map.Entry<Integer,String> s: sE )
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

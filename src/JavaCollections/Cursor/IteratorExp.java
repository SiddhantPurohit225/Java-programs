package JavaCollections.Cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExp {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

        System.out.println(arr);

        Iterator it= arr.iterator();

        while(it.hasNext())
        {
            Integer ele= (Integer)it.next();
            if(ele%2 ==0)
            {
                //we can perform remove opern using iterator
                it.remove();
            }
        }
        System.out.println(arr);


    }

}

package JavaCollections.Cursor;

import java.util.Vector;
import java.util.Enumeration;

 class EnumerationExample {

    public static void main(String[] args) {
        // Create a Vector
        Vector v = new Vector();

        // Add elements to the Vector
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }

        // Obtain an Enumeration from the Vector
        Enumeration e = v.elements();

        // Iterate over the Enumeration
        while (e.hasMoreElements()) {
            Integer currElemet =(Integer) e.nextElement();
            if(currElemet%2==0)
            System.out.println(currElemet);
        }
    }
}

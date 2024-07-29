package JavaCollections.Stack;

import java.util.Stack;

public class Example1 {
    
    public static void main(String[] args) {
        
        Stack st=new Stack();

        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");

        System.out.println(st); //prints in the order in which it was inserted
        

        //removes the top element from stack LIFO
        st.pop();
        
        System.out.println(st); //A B C

        int offset=st.search("A");
        System.err.println(offset); //3

        int offset1=st.search("Z");
        System.err.println(offset1);//-1

        System.err.println(st.peek());//returns the top elem of st --> C

    }
}

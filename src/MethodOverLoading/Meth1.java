package MethodOverLoading;

public class Meth1 {

    //auto-promotion 
    public void fun1(int x)
    {
        System.out.println("Integer getting called");
    }

    public void fun1(float x)
    {
        System.out.println("float getting called");
    }


    //child -parent realtion and sibling relation between args 

    //object is aprent of all
    // string and stringBuffer are siblings

    public void fun2(Object o)
    {
        System.out.println("Object getting called");
    }
    public void fun2(String s)
    {
        System.out.println("String getting called");
    }
    public void fun2(StringBuffer s)
    {
        System.out.println("StringBuffer getting called");
    }

}
class x {
    public static void main(String[] args) {
        Meth1 m= new Meth1();

        m.fun1(5);
        m.fun1(5.1f);
        //m.fun1(5.1); //unable to auto inc -->C.E
        m.fun1('a'); //char auto promoted to its nearest-->int ( //o/p-? Integer getting called) 
    }
}

class y
{
    public static void main(String[] args) {
        Meth1 m =new Meth1();

        m.fun2(new Object()); //object getting called --exact match
        m.fun2("Sid"); //string getting called
        m.fun2(new StringBuffer("Sid")); //String buffer getting called
        //m.fun2(null); //-->>C.E since both stringBuffer and string accepts this--Compiler confused
    }
}
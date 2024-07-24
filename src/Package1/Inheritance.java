package Package1;

public class Inheritance {
    
    public void fun1()
    {
        System.out.println("parent");
    }
   
}

class child extends Inheritance{
   
    public void fun1()
    {
        System.out.println("I am child");
    }
    public void fun2()
    {
        System.out.println("i am child fun2");
    }
}

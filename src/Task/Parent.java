package Task;

public abstract class Parent
{
    abstract void print();  
      
    public void printFun()
    {
        System.out.println("Header");
        print();
        System.out.println("Footer");   
     }
}

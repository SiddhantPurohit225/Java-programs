import Package2.*;
//class can be declared as abstract without having any abstract methods(having partial implementation)
abstract class x{
    public abstract void a();
    public abstract void b();
}

 class child extends x{
    public  void a(){
        System.out.println("I am 1st level child of A");
    };
    public  void b(){
        System.out.println("I am 1st level child");
    };
}
class shubChild extends child{
    public void a()
    {
        System.out.println("I am 2nd level child");
    }

    public void b()
    {
        System.out.println("I am 2nd level childB");
    }
}

public abstract class App2
{
    abstract void meth();
    
	public static void main(String[] args) {
	   
	    x  varX= new shubChild();
        varX.b();
        //create an object of package1 , class xChild
        PackageTest c= new PackageTest();
        c.abcd();
		System.out.println("Hello Worldd");
	}
}
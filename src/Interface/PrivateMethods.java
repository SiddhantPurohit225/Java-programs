package Interface;

interface inter{

    private void private_method()
    {
        System.out.println("hello from private of inter");
    }
    
    default void fun1()
    {
        private_method();
        System.out.println("hello from public of inter");
    }
}

class Subclass implements inter

{    public void fun2()
    {
        // fun();
        System.out.println("Hello from method 2 of subclass");
    }
}

 class Main
{
	public static void main(String[] args) {
		
		Subclass child=new Subclass();
		child.fun1();
		
	}
}
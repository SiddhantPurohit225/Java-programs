package Interface;

interface vehicle{
    public static final int a=10; 
       public  void printHello(); 
       
       public default void def(){
        System.out.println("Default method of interface ");
    }
}

class Bike implements vehicle{
    public void printHello(){
        System.out.println("Hello from printhello");
    }
}

public class Main
{
	public static void main(String[] args) {
	   
	    Bike m = new Bike();
	    m.printHello();
	   
	    m.def();
	   
		System.out.println(vehicle.a);
	}
}
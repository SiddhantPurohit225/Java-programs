package Package1;

//class can be declared as abstract without having any abstract methods(having partial implementation)
abstract class x{
    public void a(){};
    public void b(){};
}
class xChild extends x{
    public void a(){
        System.out.println("xChild");
    };
    public void b(){};
}
public abstract class App
{
    abstract void meth();
    
	public static void main(String[] args) {
	   //parent ref type parent actual obj
        // Inheritance h1= new Inheritance();
        // h1.fun1();//can access parent methods
        // h1.fun2(); //cant access child methods

        // //parent ref type parent actual obj
	    // Inheritance h2= new child();
        // h2.fun1(); // can access parent method
        // h2.fun2();  // cannot acceess child methods(ref type is of parent)


        // //parent ref type parent actual obj
	    // child h3= new child();
        // h3.fun1(); // can access parent method
        // h3.fun2();  // can access child methods too
        
;
//fun1--par
//fun2--child
        // parent ref type parent actual obj
        Inheritance h1= new child(); //--implicite upcasting
        h1.fun1();//can access parent methods
        //h1.fun2(); //cant access child methods

        //Downcasting -explict-(parent ref is casted tp child inordere to access the methods of child class)
        // if(h1 instanceof child) // save to check if parentRef is an instance of child only
        // {
        //     child childRef=(child)h1;
        //     childRef.fun2();
        // }

	}
}
package Method_hiding;

//if both parent and child class contains methods which are static and overirided then it is called 
//method hinding , and tin this case the complier is responsibe for calling the appriopriate
//methods based on the reference type and not based on the run time object.
//also k/a static polmorphism.


class Parent {
    public static void f1()
    {
        System.out.println(
            "f1 method of the parent class is executed.");
    }
}
 
// class child extend Demo class
class child extends Parent {
    public static void f1()
    {
        System.out.println(
            "f1 of the child class is executed.");
    }
}
public class Main {
 
    public static void main(String args[])
    {
        Parent d1 = new Parent();
        Parent d2 = new child();


        child c=new child();
 
        d1.f1();
        d2.f1();
        c.f1();
        }
}
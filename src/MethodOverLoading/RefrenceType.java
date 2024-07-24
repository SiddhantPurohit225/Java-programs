package MethodOverLoading;

public class RefrenceType {

}

class child extends RefrenceType {

}

class  test{

    void fun(RefrenceType r)
    {
        System.out.println("Parent");
    }

    void fun(child c)
    {
        System.out.println("child");
    }

    public static void main(String[] args) {
        test  t=new test();

        RefrenceType rf=new RefrenceType();
        child c= new child();
        RefrenceType rf1=new child();

        t.fun(rf);
        t.fun(c);
        t.fun(rf1); //prints parent , since in method overloading compiler looks for refrence type
        //and not to the actual object.

    }
}
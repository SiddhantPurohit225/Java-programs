class X{
    static void fun()
    {
        System.out.println("i am fun");
    }
}

//we can access the static methods instantiating its class's object as well but not rec.
public class Test {
    public static void main(String[] args) {
        X obj=new X();
        X.fun();
    }
}

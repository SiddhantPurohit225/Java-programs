package InnerClass;

public class MethodLocal {
    
    int x=5;
    static int y=10;
    public static void fun()
    {

        //sum function required frequently inside the fun function only:
        class Local
        {

            public int sum(int a, int b)
            {
                return a+b;
            }

            public void sum2(int x,int y)
            {
                System.out.println(x+ " " + y);
            }
        }

        Local l=new Local();

        System.err.println(l.sum(10,20));

        System.err.println(l.sum(20,20));


    }
}

 class Test10{
    
    public static void main(String[] args) {
        MethodLocal m=new MethodLocal(); 
        m.fun();
    }
}

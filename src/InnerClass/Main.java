package InnerClass;

class Outer12 {
    int x=10;

    class Inner12{
        int x=100;

        public void m()
        {
            int x=1000;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Inner12.this.x);
            System.out.println(Outer12.this.x);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        new Outer12().new Inner12().m();
    }
}

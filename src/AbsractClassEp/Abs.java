package AbsractClassEp;

public abstract class Abs {
     void s(){
        System.out.println("i am printed");
    }
}

class x extends Abs{
    public void c()
    {
        System.out.println("i am child");
    }
    
}

class MainClass {
        public static void main(String[] args) {
            System.out.println("i am child");
            // Abs.s();
        }
    }

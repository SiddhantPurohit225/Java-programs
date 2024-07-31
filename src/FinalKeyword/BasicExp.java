package FinalKeyword;

public class BasicExp {
    final int x=5;
    public final int value;

    //static final belongs to the class, initialized though sttaic block
    public static final int cont;
    static{
        cont=100;
    }

    public BasicExp(int value) {
        this.value = value;
    }
    public void change()
    {
        //x=10;//cannot be reassigned after initialization
    }

    public static void main(String[] args) {
        BasicExp example = new BasicExp(42); // Initializing the final field through the constructor
        System.out.println(example.x);
        // BasicExp.cont=100; //cannot nitlaise a final static field after class initlaization 
    }
}


package Interface;

  interface Interf {

    final static int r=5;

    public void meth(); // by deafult interface and its memebers are public and abstract 
    
    private void helper()
    {
        System.out.println("I am a helper method declare as private");
    }

    public default int helper2(int x)
    {
        helper();
        System.out.println("private method2 calling 1");
        return x;
    }
}

class X implements Interf{

     public void meth(){ // cannot reduce the scope of meth (has to be p)
        System.out.println("heldlo i");
    }
    
    public int helper2(int x)
    {
        return x+5;
    }

}


 class C 
{
    public static void main(String[] args) {
        X varo=new X();
        varo.meth();
    }
}
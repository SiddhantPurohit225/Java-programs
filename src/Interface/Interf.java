package Interface;

  interface Interf {

    public void meth(); // by deafult interface and its memebers are public and abstract 
}

class X implements Interf{

     public void meth(){ // cannot reduce the scope of meth (has to be p)
        System.out.println("heldlo i");
    }
}


 class C 
{
    public static void main(String[] args) {
        X varo=new X();
        varo.meth();
    }
}
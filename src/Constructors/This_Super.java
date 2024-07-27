package Constructors;

 class Parent {
    
    public String name="Parent";

    Parent(String name){
        // this.name=name;
        System.out.println(name); // prints hello
    }
}
class Child extends Parent{

    public String name;
    
    Child(String name){
        super(name);
        this.name=name;
        System.out.println(this.name); //prints hello
        System.out.println(super.name);// print parent
    }

    static void fun()
    {
        
    //System.out.println(this.name);//CE cannot use this and super insdier static 
    }
}

class maxin{
    public static void main(String[] args) {
        Child c =new Child("Hello");
        
    }
}

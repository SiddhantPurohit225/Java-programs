package Generics;

class GenClass<T extends Animal>

{
    public void fun(T instance_variable) {
        instance_variable.makeSound();
    }

}

class Animal {
    public void makeSound() {
        System.out.println("Animal making sound");
    }
}

class Cat extends Animal

{
    public void makeSound() {
        System.out.println("Cat making sound");
    }
}

class Dog extends Animal

{    
    public void makeSound()
    {
        System.out.println("Dog making sound");
    }
}
class Mammal
{    
    
    public void makeSound()
    {
        System.out.println("Mammal making sound");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a = new Dog();
        Mammal m = new Mammal();

        GenClass<Animal> gn1 = new GenClass<>();
        gn1.fun(a);

        // type checking
        // GenClass<Mammal> gn2 = new GenClass<>();
        // gn2.fun(m);
    }
}
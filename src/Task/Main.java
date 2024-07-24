import java.util.Scanner;public class Main {
    public static void main(String[] args) {        // ParentClass p= new Child1();
        // String ans=p.printFun("I am the first child!");
        // System.out.println(ans);        Scanner sc =new Scanner(System.in);
        // System.out.println("Type 1 to print Header");
        // System.out.println("Type 2 to print Middle");
        // System.out.println("Type 3 to print Footer");
        // System.out.println("Type 0 to print Exit");        int input ;        do{
            input = sc.nextInt();
            switch (input) {
                case 1:
                    ParentClass p1= new Child1();
                    System.out.print("1. ");
                    p1.printFun("First");
                    break;
                case 2:
                    ParentClass p2= new Child1();
                    System.out.print("2. ");
                    p2.printFun("Second");
                    break;
                case 3:
                    ParentClass p3= new Child1();
                    System.out.println("3. ");
                    p3.printFun("Third");
                    break;
                case 0:
                System.out.println("Terminating the process!" );
                    break;
                default:
                System.out.println("Invalid input! Enter(0,1,2 or 3 only)");
                    break;
            }
        }while(input!=0);
    }
}

abstract class ParentClass{  
      abstract void print(String s);  
      
    public void printFun(String s)
    {
        System.out.println("Header");
        print(s);
        System.out.println("Footer");    }
}

public class Child1 extends ParentClass {
    public void print(String s)
    {
        System.out.println(s);
    }
}
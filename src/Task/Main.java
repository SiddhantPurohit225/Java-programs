package Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {       
      
         Scanner sc =new Scanner(System.in);
      
           int input ;       
            do{
            input = sc.nextInt();
            switch (input) {
                case 1:
                Parent p1= new Child1();
                    System.out.print("1. ");
                    p1.printFun();
                    break;
                case 2:
                 p1= new Child2();
                    System.out.print("2. ");
                    p1.printFun();
                    break;
                case 3:
                 p1= new Child3();
                    System.out.println("3. ");
                    p1.printFun();
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




package Constructors;

 class Student {
    String name;
    int roll_num;

    Student()
    {
        System.out.println("default con called");
    }
    Student(String name, int roll_num)
    {
        this.name=name;
        this.roll_num=roll_num;
        System.out.println("con called");
    }
}

public class Basics
{
    public static void main(String[] args) {
        Student s1= new Student("sid", 1);
        Student s2= new Student("sid2", 2);
        Student s3= new Student();

        System.out.println(s3.name);///null


    }
}
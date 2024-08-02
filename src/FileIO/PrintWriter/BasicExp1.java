package FileIO.PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;

class X{
    Integer x;

    String name;

    X(int x, String name)
    {

        this.x=x;
        this.name=name;
    }
    
    public void fun()
    {
System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "X{" +
               "x=" + x +
               ", name='" + name + '\'' +
               '}';
    }
}
public class BasicExp1 {
    
    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("/home/siddhant/Desktop/Hello.java/src/FileIO/PrintWriter/TextFile.txt");
        pw.println(100);
        pw.println('A');
        pw.println("100 as string");
        pw.println(true);
        pw.println(100);

        X obj=new X(110000,"Sidd");

        //in
        pw.print(obj);
        

        pw.close();

    }
}

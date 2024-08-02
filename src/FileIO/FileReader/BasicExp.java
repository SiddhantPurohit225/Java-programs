package FileIO.FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BasicExp {
    public static void main(String[] args) throws IOException{
        

        // //creating a file in the same directory
        // String dir ="/home/siddhant/Desktop/Hello.java/src/FileIO/FileReader/ReadFile.txt";
        // File f=new File(dir);
        // f.createNewFile();

        // //writing data into the file:
        // FileWriter fw=new FileWriter(f);
        // fw.write("Hello i am a file to read");
        // fw.close();

        // //reading data from the file:
        // FileReader fr= new FileReader(f);
        // int i=fr.read();//returns unicode char by char and returns -1 at the end
        // while(i!=-1)
        // {
        //     System.out.print((char)i);
        //     i=fr.read();
        // }

        // fr.close();
        //creating a file in the same directory
        String dir ="/home/siddhant/Desktop/Hello.java/src/FileIO/FileReader/Read2File.txt";
        File f=new File(dir);
        f.createNewFile();

        //writing data into the file:
        FileWriter fw=new FileWriter(f);
        fw.write("Hello i am a file to read");
        fw.close();

        //reading data from the file:
        FileReader fr= new FileReader(f);

        //old:
        //using char array to read at once:(not good if len of char  > MAX_INT )
        char[] charArr=new char[(int)f.length()];

        int i=0;
        while(i!=charArr.length)
        {
            System.out.print((char)i);
        
        }

        fr.close();
    }
}

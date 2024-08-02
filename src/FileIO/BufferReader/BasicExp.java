package FileIO.BufferReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BasicExp {
    public static void main(String[] args) throws IOException{
        
        String filepath= "/home/siddhant/Desktop/Hello.java/src/FileIO/BufferReader/BasicExpTxt.txt";
        File f= new File(filepath);
        f.createNewFile();
        FileReader fr= new FileReader(filepath);

        BufferedReader br= new BufferedReader(fr);

        String s=br.readLine();
        while(s!=null)
        {
            System.out.println(s);
            s=br.readLine();
        }

        br.close(); 
    }
}

package FileIO.BufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BasicExp {
    
    public static void main(String[] args) throws IOException{
        String filePath = "/home/siddhant/Desktop/Hello.java/src/FileIO/BufferWriter/Text.txt";

        FileWriter fw= new FileWriter(filePath);

        BufferedWriter bw= new BufferedWriter(fw);

        bw.write("helllllllllllooo");
        bw.newLine();
        bw.write("I am next line");
        bw.write("100");
        

        char[] c={'a','c'};
        bw.write(c,0,1);
        bw.append("llld");

        bw.flush();
        //closing bw then internal fw gets closed autometically
        bw.close();

    }
}

package FileIO.Writer;
import java.io.*;
  
 class WriterExample {  
    public static void main(String[] args) throws IOException {  
        String directoryPath = "/home/siddhant/Desktop/Hello.java/src/FileIO/Writer/";
        String fileName = "BasicExp.txt";
        
        // Create a FileWriter object with the specified directory and file name
        FileWriter w = new FileWriter(directoryPath + fileName,true);
        w.write("Hello, World!");
        w.write(100);
        char ch[]={'a','b'};

        //programmer has to manually write \n for next line --> so we have bufferwriter and printwriter
        w.write("Hello,\n World!") ;

        // Close the FileWriter to save the changes
        w.close();
    }  
}  
package FileIO;

import java.io.File;

public class Exp1 {

    public static void main(String[] args) {
    
        File f=new File("newFile.txt");
        System.out.println(f.exists()); //physically the file is not yet created ---false

        try{
            f.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        System.out.println(f.exists());//true

    }
    



}

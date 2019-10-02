/*package com.greatlearning.fsd.backend.week6;*/

import java.io.*;
import java.lang.*;

public class FileRead{

    public static void main(String args[]){

        String directory = System.getProperty("user.home");
        String fileName = "pgm1.txt";
        String absolutePath = directory+File.separator+fileName;
       System.out.println(directory);
       System.out.println(fileName);
       System.out.println(absolutePath);

       try(FileReader fileReader = new FileReader(absolutePath)){
        int ch = fileReader.read();
        while(ch != -1){
            System.out.println((char)ch);
            ch = fileReader.read();
        } 
        
    }
    catch(IOException e){
           
    }
    
        
    }
}
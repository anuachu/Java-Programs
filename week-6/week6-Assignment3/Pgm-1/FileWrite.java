/*package com.greatlearning.fsd.backend.week6;*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class  FileWrite {
     
     public static void main(String args[]){
         
        String directory = System.getProperty("user.home");
        String fileName = "pgm1.txt";
        String absolutePath = directory+File.separator+fileName;
       System.out.println(directory);
       System.out.println(fileName);
       System.out.println(absolutePath);

       try(FileWriter fileWriter = new FileWriter(absolutePath)){
        for(int i = 1; i < 100; i++ ){
            String str = Integer.toString(i);

            fileWriter.write(str);
            fileWriter.write("\n");
            
        }
       }
       catch(IOException e){
           
       }
       
     }
    }


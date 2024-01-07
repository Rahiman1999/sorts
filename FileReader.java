package com.javatpoint;  
  
import java.io.FileReader;  
public class FileReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\testout.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    


public void trainIdList(int number){
    String fileName = number+""+".txt";
    try {
        FileReader fr = new FileReader(fileName);
        int i;
        while ((i= fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }catch (Exception e){
        System.out.println(e);
    }
}
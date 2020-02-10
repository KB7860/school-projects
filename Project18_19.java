package project18_19;

import java.io.File;
import java.util.Scanner;

/**
 * @author Kyle Brown
 * @Title Project18.14
 * This project lists all the files and subdirectories in a directory, in addition,
 * it displays the files and subdirectories of the former, and so on. 
 */
public class Project18_19 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Please enter the directory: ");
        String dir = input.nextLine();
        
        File folder = new File(dir);
        File[] listOfFiles = folder.listFiles();
        
        print (listOfFiles, 0, 0);
        
        
    }
    public static void print (File[] arr, int index,int level) {
             
         if(index == arr.length) 
             return; 
        
         for (int i = 0; i < level; i++) 
             System.out.print("\t"); 
         
         if(arr[index].isFile()) 
             System.out.println(arr[index].getName()+ " (Last modified " + 
                     arr[index].lastModified() + ", Size " + arr[index].getTotalSpace()
            + ")"); 
        
         else if(arr[index].isDirectory()) 
         { 
             System.out.println("Directory: " + arr[index].getName()); 
             print(arr[index].listFiles(), 0, level + 1); 
         } 
         print(arr,++index, level); 
        }
    
}

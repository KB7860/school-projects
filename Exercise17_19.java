/*
 * Kyle Brown
 * Project 17.19
 * View Hex
 * This program prompts a user for a file name, then reads that file and 
 * displays each byte's hex representation
 */
package exercise17_19;
import java.io.*;
import java.util.Scanner;
public class Exercise17_19 {

    
    public static void main(String[] args) throws Exception {
        //test code; creates file to read from
        /*try (DataOutputStream output = 
                    new DataOutputStream(new FileOutputStream("Exercise17_03.dat"))){
                     output.writeInt(4);
                     output.writeInt(8);
                     output.writeInt(15);
                     output.writeInt(16);
                     output.writeInt(23);
                     output.writeInt(42);
                    }*/
        //prompts user for file name
        System.out.println("Please enter the file name: ");
        //creates scanner
        Scanner userInput = new Scanner (System.in);
        //creates File object based on user input
        File file = new File(userInput.nextLine());
        
        try (DataInputStream input = new DataInputStream(new FileInputStream(file))){
                //creates catcher
                int catcher;
                //loop
                while((catcher = input.read()) != -1){
                    //converts the byte to an Integer, then to it's Hex value
                    //expressed as a String. Prints value
                System.out.print(Integer.toHexString(catcher));
                }
            }
    }
}
    


/*
 * Kyle Brown
 * Project 12.26
 * Create a Directory
 * This program creates a directory if it does not exist. If it does exist,
 * it informs the user.
 */
//package and imports
package exercise12_26;
import java.io.File;
import java.util.Scanner;

public class Exercise12_26 {

    public static void main(String[] args) {
        //initializes scanner
        Scanner input = new Scanner(System.in);
        
        //prompts user for file name and creates file
        System.out.print("Please enter the directory name: ");
        File f = new File(input.next());
        
        //checks if the file has a directory. If not, creates directory and
        //informs user
        if (!f.exists()) {
            f.mkdir();
            System.out.println("Directory Created Successfully");
        }
        //if directory exists, informs user
        else {
            System.out.println("This directory already exists");
        }
    }
    
}

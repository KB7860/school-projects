/*
 * Kyle Brown
 * Project 17.3
 * Sum all the integers in a binary data file
 * This program creates a binary data file, then reads itand sums it's integer
 * contents.
 */
 
//package and import
package exercise17_3;
import java.io.*;

public class Exercise17_3 {

    
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise17_03.dat");
        //declare and initialize sum variable
        int sum = 0;
        //checks to see if file exists. If not, creates file.
        if (!file.exists()) {
            try (DataOutputStream output = 
                    new DataOutputStream(new FileOutputStream("Exercise17_03.dat"))){
                     output.writeInt(4);
                     output.writeInt(8);
                     output.writeInt(15);
                     output.writeInt(16);
                     output.writeInt(23);
                     output.writeInt(42);
                    }
        }
        
        try (DataInputStream input = new DataInputStream(new FileInputStream(
        "Exercise17_03.dat"))) {
            //infinite loop until the end of the file is reached
            while (sum >= 0){
                //adds next int to sum variable
            sum += input.readInt();
            }
                 
        }
        //catches exception and prints sum
        catch (EOFException ex) {
            System.out.println("The sum is " + sum);
        }
    }
    
}

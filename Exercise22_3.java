/*
 * Kyle Brown
 * Exercise 22.3
 * Pattern Matching
 * This program prompts a user to enter 2 strings, then searches the first to
 * determine if the second string is a substring of the first.
 */

/*
*****************
* Time Complexity
*****************
* The loop in a worst case scenario repeats a number of times equal to the
* length of the first string (n). Thus, the time complexity is O(n).
*/
package exercise22_3;
import java.util.Scanner;

public class Exercise22_3 {

    
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("This program will search the first string you enter and "
           + "determine if it includes the second string.");
   System.out.print("Please enter the first string: ");
   String mainString = input.nextLine();
   System.out.println();
   System.out.print("Please enter the second string: ");
   String secondString = input.nextLine();
   
   int count = 0;
   boolean matchFound = false;
   
   for (int i = 0; i < mainString.length(); i ++){
       if (mainString.charAt(i) == secondString.charAt(count)){
       count++;
       }
       else {
           count = 0;
       }
       if (count == secondString.length()) {
           matchFound = true;
           break;
       }
   
   }
   if (!matchFound) {
       System.out.println("The second string is not a substring of the first.");
   }
   else {
       System.out.println("The second string is a substring of the first.");
   }
   
}
    
}

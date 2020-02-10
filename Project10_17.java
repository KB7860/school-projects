/*
 * Kyle Brown
 * Project 10.17
 * Square Numbers
 * This program finds the first ten square numbers larger than long.MAX_VALUE.
 */
package project10_17;
import java.math.BigDecimal;

public class Project10_17 {

    //main method
    public static void main(String[] args) {
        //prints preface to viewer
        System.out.println("The ten square numbers immediately larger than " +
                Long.MAX_VALUE + " are as follows: ");
        //creates a BigDecimal array to hold values
        BigDecimal [] arr = new BigDecimal [10];
        //creates initial square root
        long l = (long) Math.sqrt(Long.MAX_VALUE);
        //stores long value in a BigDecimal object
        BigDecimal b = new BigDecimal(l);
        
        //calculation loop, stores calculations in the BigDecimal array
        for (int count = 0; count < 10; count ++) {
            arr[count] = b.multiply(b);
            b = b.add(BigDecimal.ONE);
        }
        //prints the array to the console
        for (int count = 0; count < 10; count ++){
            System.out.println(arr[count]);
        }
    }
   
    
}

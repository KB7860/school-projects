/*
 * Kyle Brown
 * Exercise 19.5
 * Maximum Element in an Array
 * This program implements a method that determines the max value in an array
 */
package exercise19_5;

public class Exercise19_5 {

    public static void main(String[] args) {
        //creates arrays
        Integer [] ints = new Integer[]{4, 8, 42, 15, 16, 23};
        String [] strings = new String[]{"so","why", "serious"};
        
        //runs max method
        Integer maxInteger = max(ints);
        String maxString = max(strings);
        
        System.out.println("The highest valued Integer is " + maxInteger);
        System.out.println("The highest valued String is " + maxString);
    }
    public static <E extends Comparable<E>> E max (E[] list){
        E max = list[0];
        for (int count = 1; count < list.length; count++){
            if (list[count].compareTo(max) > 0)
                max = list[count];
        }
        return max;
    } 
    
}

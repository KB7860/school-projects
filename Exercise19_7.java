/*
 * Kyle Brown
 * Exercise 19.7
 * Generic Binary Search
 * This program implements a Generic Binary Search method
 */
package exercise19_7;

public class Exercise19_7 {

    public static void main(String[] args) {
        //creates pre-sorted arrays
        Integer [] ints = new Integer[]{4, 8, 15, 16, 23, 42};
        String [] strings = new String[]{"serious","so",   "why"};
        
        int intsResult = binarySearch(ints, 15);
        int stringsResult = binarySearch(strings, "serious");
        
        System.out.println("The index of 15 is: " + intsResult);
        System.out.println("The index of 'serious' is: " + stringsResult);
        
    }
    public static <E extends Comparable<E>>
        int binarySearch (E[] list, E key){
        int low = 0;
        int high =list.length - 1;
        
        while (high >= low) {
            int mid = ((high-low) / 2) + low;
            if (list[mid].compareTo(key) == 0)
                return mid;
            else if (list[high].compareTo(key) == 0)
                return high;
            else if (list[low].compareTo(key) == 0)
                return low;
            else if (list[mid].compareTo(key) < 0)
                low = mid + 1;
            else
                high = mid + 1;
        }
        return -1;
        }
    
}

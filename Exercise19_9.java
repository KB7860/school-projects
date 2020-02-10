/*
 * Kyle Brown
 * Exercise 19.9
 * Sort ArrayList
 * This program implements a generic method that sorts an ArrayList
 */
package exercise19_9;
import java.util.ArrayList;

public class Exercise19_9 {

    
    public static void main(String[] args) {
        //creates ArrayList of Integers, adds items to list
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(42);
        ints.add(8);
        ints.add(4);
        ints.add(15);
        ints.add(16);
        ints.add(23);
        ints.add(15);
        ints.add(42);
        //creates ArrayList of Strings, adds them to list.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("serious");
        strings.add("why");
        strings.add("so");
        strings.add("why");
        strings.add("so");
        strings.add("why");
        strings.add("serious");
        //displays originals
        for (Integer n : ints) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        //runs sort
        sort(ints);
        sort(strings);
        
        //displays sorted lists
        for (Integer n : ints) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (String s : strings) {
            System.out.print(s + " ");
        }
        
    }
    public static <E extends Comparable<E>> void sort (ArrayList<E> list){
        E currentMin;
        int currentMinIndex;
        
        for (int i= 0; i < list.size(); i++){
            currentMin = list.get(i);
            currentMinIndex = i;
            
            for (int j = i+1; j < list.size(); j++ ){
                if (currentMin.compareTo(list.get(j)) > 0){
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
    
}

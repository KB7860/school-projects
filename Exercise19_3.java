/*
 * Kyle Brown
 * Exercise 19.3
 * Distinct elements in an array list
 * This method receives an array list, removes duplicates, and returns the 
 * new array list.
 */
package exercise19_3;
import java.util.ArrayList;

public class Exercise19_3 {

    
    public static void main(String[] args) {
        //creates ArrayList of Integers, adds items to list
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(4);
        ints.add(8);
        ints.add(4);
        ints.add(15);
        ints.add(16);
        ints.add(23);
        ints.add(15);
        ints.add(42);
        //creates ArrayList of Strings, adds them to list.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("why");
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
        
        //runs method for each list
        System.out.println("Removing duplicates");
        strings = removeDuplicates(strings);
        ints = removeDuplicates(ints);
        
        //prints results
        for (Integer n : ints) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
        
    }
    //provided method declaration
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        //creates destination list
        ArrayList<E> list2 = new ArrayList<>(list.size());
        //searches array, adding items to destination list if they haven't been
        //already
        for (E aList : list) {
            if (!list2.contains(aList)) {
                list2.add(aList);
            }
        }
        //returns destination list
        return list2;
    } 
    
}

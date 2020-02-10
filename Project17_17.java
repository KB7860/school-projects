
package project17_17;

/**
 *
 * @author Kyle Brown
 * @title Project 17.17
 * This project implements a doubly linked list that contains a move-to-front
 * heuristic. When an item is accessed, it is moved to the front of the list.
 */
public class Project17_17 {

    public static void main(String[] args) {
        //Integer test
        MTFList list1 = new MTFList();
        list1.add(4);
        list1.add(8);
        list1.add(15);
        list1.add(16);
        list1.add(23);
        list1.add(42);
        
        //before access
        System.out.println("The original head of list 1 is: "+list1.peek());
        
        //after access
        list1.find(16);
        System.out.println("The new head is: "+list1.peek());
        
        /******************************************************************/
        
        //String test
        MTFList list2 = new MTFList();
        list2.add("Hello");
        list2.add("World");
        list2.add("!");
        
        //before access
        System.out.println("The original head of list 2 is: "+list2.peek());
        
        //after access
        list2.find("!");
        System.out.println("The new head is: "+list2.peek());
        
        /******************************************************************/
        
        //double test
        
        MTFList list3 = new MTFList();
        list3.add(4.0);
        list3.add(8.1);
        list3.add(15.2);
        list3.add(16.3);
        list3.add(23.4);
        list3.add(42.5);
        
        //before access
        System.out.println("The original head of list 3 is: "+list3.peek());
        
        //after access
        list3.find(23.4);
        System.out.println("The new head is: "+list3.peek());
    }
    
    
}

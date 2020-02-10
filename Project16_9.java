
package project16_9;

/**
 * @title Project 16.9
 * @author Kyle Brown
 * This project implements an output-restricted double-ended queue. 
 */
public class Project16_9 {

    
    public static void main(String[] args) {
        Ordequeue<String> queue = new Ordequeue<String>();
        
        queue.addRear("World");
        queue.addFront("Hello");
        queue.addRear("!");
        
        while (queue.isEmpty() == false) {
            System.out.print(queue.peek() + " ");
            queue.removeFirst();
        }
            
    }
}
        
        
    
    


package project16_10;

/**
 * @title Project 16.10
 * @author Kyle Brown
 * This project uses two stacks, allowing the use of a findMin operation on the
 * main stack
 */
public class Project16_10 {

    public static void main(String[] args) {
        NewStack stack = new NewStack();
        stack.push(7);
        System.out.println("After Step 1 Min is " + stack.findMin());
        stack.push(14);
        System.out.println("After Step 2 Min is " + stack.findMin());
        stack.push(21);
        System.out.println("After Step 3 Min is " + stack.findMin());
        stack.push(5);
        System.out.println("After Step 4 Min is " + stack.findMin());
        stack.push(6);
        System.out.println("After Step 5 Min is " + stack.findMin());
        stack.pop();
        System.out.println("After Step 6 Min is " + stack.findMin());
        stack.pop();
        System.out.println("After Step 7 Min is " + stack.findMin());
        
        
    }
    
}

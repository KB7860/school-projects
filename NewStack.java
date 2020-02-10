
package project16_10;

import java.util.Stack;

/*
This file features the stack class (with findMin included), through the use
of an auxilliary stack.
*/

public class NewStack {

    Stack <Integer> minStack;
    Integer min;
    
    NewStack () {
        minStack = new Stack <Integer>();
    }
    
    public int findMin () {
        return min;
    }
    
    void push(Integer x) { 
        if (minStack.isEmpty()) 
        { 
            min = x; 
            minStack.push(x); 
            return; 
        } 
  
        if (x < min) 
        { 
            minStack.push(2*x - min); 
            min = x; 
        } 
  
        else
            minStack.push(x); 
   
    }
    
    void pop() { 
        if (minStack.isEmpty()) { 
            System.out.println("Stack is empty"); 
            return; 
        } 

        Integer t = minStack.pop(); 
  
        if (t < min) { 
            
            min = 2*min - t; 
        } 
 
    }
	
}

package project16_9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @title Ordequeue
 * @author Kyle Brown
 * This is the Java class for Ordequeue that I will be using in the
 * main class of this project.
 */
public class Ordequeue<Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int n; //number of elements
    
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }
    
    //constructor
    public Ordequeue () {
        first = null;
        last = null;
        n=0;
}
    //adds a new element to the front of the queue
    public void addFront (Item item) {
        Node<Item> oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        n++;
    }
    
    //adds a new element to the rear of the queue
    public void addRear (Item item) {
        Node<Item> oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldLast.next = last;
        n++;
    }
    
    public void removeFirst () {
        first = first.next;
        n--;
    }
    
    //@return true if there is not a first element to the queue. False, otherwise
    public boolean isEmpty () {
        return first == null;
    }
    
    //@return the first element in the queue
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("The queue is empty");
        return first.item;
    }
    
    
    
}


package project17_17;

import java.util.NoSuchElementException;

/**
 *
 * @author Kyle Brown
 * @title MTFList
 * This is an implementation of a linked list that will implement the
 * move-to-front heuristic
 */
public class MTFList <Item>{
    
//declares variables
    
    private Node<Item> first;
    private Node<Item> last;
    private int n; //number of elements
    
//nested node class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }
    
    public MTFList () {
        first = null;
        last = null;
        n=0;
        
    }
    
    public void add (Item item) {
        Node<Item> oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldLast.next = last;
        
        n++;
    }
    
    public boolean isEmpty () {
        return first == null;
    }
    
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("The queue is empty");
        return first.item;
    }
    
    public boolean find(Item item){
    Node previous=first;
    Node current=first;
    while(current !=null){
        if(item.equals(current.item)){
            //Found the item
            previous.next=current.next;
            current.next=first;
            first=current;
            System.out.println("Item found and moved to front of list.");
            return true;
        }
        previous = current;
        current=current.next;
    }
    //item not found
    System.out.println("Item not found.");
    return false;
}
    
    

    
}

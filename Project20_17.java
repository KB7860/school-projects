
package project20_17;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Kyle Brown
 * @title Project 20.17
 * This program creates a hash table 
 * 
 * Analysis:
 * In this case, the hash function distribution should be essentially the same 
 * as the distribution of theoretical random numbers. 
 */
public class Project20_17 {
    
    

    private final static int TABLE_SIZE = 135054;
    public static void main(String[] args) throws FileNotFoundException {
        //for testing, replace with location of dictionary.txt file
        File dic = new File ("dictionary.txt");
        Scanner s = new Scanner(dic);
        HashTable table = new HashTable();
        while (s.hasNext()) {
            String value = s.nextLine();
            table.put(hash(value), value);
        }
        int searchKey = hash("aardvark");
        System.out.println(searchKey);
        System.out.println(table.get(searchKey));
        
    }
    public static int hash (String key){
            
            int hashVal = 0;
            for (int i = 0; i < key.length(); i++) {
                hashVal = 37 * hashVal + key.charAt(i);
            }
            hashVal %= TABLE_SIZE;
            if (hashVal < 0) 
                hashVal += TABLE_SIZE; 
    return hashVal;
    }
            
    
    
}

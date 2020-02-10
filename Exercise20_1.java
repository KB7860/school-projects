package exercise20_1;

/*
 * Kyle Brown
 * Program 20.1
 * Display words in ascending alphabetical order
 * This program reads words from a text file, then adds them to a priority
 * queue. It prints the words in alphabetical order by removing them from the
 * queue.
*/
import java.io.*;
import java.util.PriorityQueue;

public class Exercise20_1 {
    public static void main (String [] args) throws Exception{
    
        //Creates new text file and populates it
        File file = new File("Exercise20_1_file");
        try (PrintWriter output = new PrintWriter(file)) {
            output.println("7What");
            output.println("Do");
            output.println("You");
            output.println("Get");
            output.println("If");
            output.println("You");
            output.println("Multiply");
            output.println("6Six");
            output.println("By");
            output.println("9Nine");
            output.println("4tyTwo");
        }
        
        //creates the Priority Queue
        PriorityQueue<String> q = new PriorityQueue<>
        (1000, String.CASE_INSENSITIVE_ORDER);
        
        
        //reads in file
        try (BufferedReader in = 
                new BufferedReader(new FileReader("Exercise20_1_file"))) {
            
        String string;
        
        //add lines to the priority queue, sends them to the number checking
        //method
        while ((string = in.readLine()) != null){
            String[] words = removeNumbers(string);
            for (String word : words) {
                q.add(word);
            }
        }
        }
        //catches File Not Found
        catch (FileNotFoundException ex){
            System.out.println("File Not Found");
        }
        //Prints the lines in ascending order
        while (q.size() > 0){
        System.out.println(q.poll());
        }
    
    }
    //Method that ensures the input line does not start with a number
    public static String[] removeNumbers (String line){
    
        line = line.replaceAll("[0-9]\\p{L}+", "");
        return line.split(" ");
        
    }
}
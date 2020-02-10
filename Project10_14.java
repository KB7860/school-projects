/*
 * Kyle Brown
 * Project 10.14
 * The MyDate Class
 * This program contains a MyDate class, as well as a test that contructs two
 * MyDate objects
 */
package project10_14;
import java.util.GregorianCalendar;



public class Project10_14 {

    
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(34355555133101L);
        
        System.out.println("Date 1 is " + d1.getMonth() + "/" + d1.getDay() 
                + "/" + d1.getYear());
        System.out.println("Date 2 is " + d2.getMonth() + "/" + d2.getDay() 
                + "/" + d2.getYear());
    }
    
}

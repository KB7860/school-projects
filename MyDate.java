
package project10_14;
//imports the calendar
import java.util.GregorianCalendar;

//class declaration
public class MyDate {
    //declares instance variables
    private int year;
    private int month;
    private int day;
    
    //no arg constructor
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        //initializes values using GregorianCalendar class
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    //contructor with parameter for milliseconds
    public MyDate (long l) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(l);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    
    }
    
    public MyDate (int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }
    
    //getter methods
    public int getYear () {
        return year;
    }
    
    public int getMonth () {
        return month;
    }
    
    public int getDay () {
        return day;
    }
    
    //method that sets the date according to a value in milliseconds
    public void setDate (long l) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(l);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    
    }
    
}

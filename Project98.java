/*
This program contains a class named Fan. The fan has several settings.
The class contains a no arg constructor, and methods for changing the
various settings.
*/
package project9.pkg8;

//file
public class Project98 {

    //main method
    public static void main(String[] args) {
        //creates fans
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        //sets fan1
        fan1.setSpeed(3);
	fan1.setRadius(10);
	fan1.setColor("yellow");
	fan1.setOn(true);
        
        //sets fan2
        fan2.setSpeed(2);
	fan2.setRadius(5);
	fan2.setColor("blue");
	fan2.setOn(false);
        
        //prints to fan specifications to console
        System.out.println("Fan 1 = " + fan1.toString());
	System.out.println("");
	System.out.println("Fan 2 = " + fan2.toString());
        
    }
//declaration for class Fan
public static class Fan {
    
    //creates constants
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    
    //declares instance variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    //setter for speed
    public void setSpeed (int s) {
        speed = s;
    }
    //setter for on
    public void setOn (boolean o) {
        on = o;
    }
    //setter for radius
    public void setRadius (double r) {
        radius = r;
    }
    //setter for color
    public void setColor (String c) {
    color = c;
    }
    //getter for speed
    public int getSpeed (){
	return speed;
    }
    //getter for on
    public boolean isOn () {
        return on;
    }
    //getter for radius
    public double getRadius () {
        return radius;
    }
    //getter for color
    public String getColor () {
        return color;
    }
    //constructor for Fan
    public Fan () {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    //toString method
    public String toString () {
        return (this.speed + " " + this.on + " " + this.radius + " " + 
                this.color);
    }
    
}    
}

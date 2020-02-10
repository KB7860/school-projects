/*
 This program contains a linear equation class. It stores values for the
 equations in instance variables. It contains a method that determines if
 the equation is solvable.
 */
package algebra_linearequations;

import java.util.Scanner;
public class Algebra_linearequations {

    //Main method
    public static void main(String[] args) {
        //initializes scanner
        Scanner input = new Scanner (System.in);
        
        //prompts user, stores user input in array
        System.out.print("Please enter the values of a, b, c, d, e, and f, "
                + "separated by spaces. Then press enter. : ");
        int [] arr = new int [6];
        for (int count = 0; count < 6; count ++) {
            arr[count] = input.nextInt();
        }
        
        //uses array to initialize a linear equation
        LinearEquation linEqu = new LinearEquation (arr[0], arr[1], arr[2],
            arr[3], arr[4], arr[5]);
        
        //tests if linequ is solvable. If so, calculates and displays x and y.
        if (linEqu.isSolvable()){
        System.out.println("X = " + linEqu.getX());
        System.out.println("Y = " + linEqu.getY());
        }
        //if the problem is unsolvable, displays this message to the user
        else
            System.out.println("The problem is unsolvable.");
        
    }
    //LinearEquation class
    public static class LinearEquation {
        //declares instance variables
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        
        //constructor
        public LinearEquation (int aI, int bI, int cI, int dI, int eI, int fI) {
            //intializes instance variables
            this.a = aI;
            this.b = bI;
            this.c = cI;
            this.d = dI;
            this.e = eI;
            this.f = fI;
            
        }
        //getter for a
        public int getA () {
            return a;
        }
        //getter for b
        public int getB () {
            return b;
        }
        //getter for c
        public int getC () {
            return c;
        }
        //getter for d
        public int getD () {
            return d;
        }
        //getter for e
        public int getE () {
            return e;
        }
        //getter for f
        public int getF () {
            return f;
        }
        
        //returns true if the result will not be undefined, false if they will
        //return undefined
        public boolean isSolvable () {
            if ((a * d) - (b * c) == 0)
                return false;
            else
                return true;
        }
        //solving for and returning x
        public int getX () {
            return ((e * d) - (b * f)) / ((a * d)-(b * c));
        }
        //solving for and returning y
        public int getY () {
            return ((a * f) - (e * c)) / ((a * d)-(b * c));
        }
    }
}

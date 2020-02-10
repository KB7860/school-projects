/*
 * This program prompts the user to enter two 3 X 3 matrices. It then adds the
 * corresponding elements of the arrays.
 */
package exercise8_5;
import java.util.Scanner;


public class Exercise8_5 {

    
public static void main(String[] args) {
    
  //declares the two arrays
  double[][] a = new double[3][3];
  double[][] b = new double[3][3];
  //declares the array that the addition results will be stored in
  double[][] c;
 
  //initializes scanner
  java.util.Scanner input = new Scanner(System.in);
  //prompts user for input of first matrix
  System.out.print("Enter matrix1:");
  for (int i = 0; i < a.length; i++) {
   for (int j = 0; j < a[0].length; j++) {
    a[i][j] = input.nextDouble();
   }
 
  }
  //prompts user for input of second matrix
  System.out.print("Enter matrix2:");
  for (int i = 0; i < b.length; i++) {
   for (int j = 0; j < b[0].length; j++) {
    b[i][j] = input.nextDouble();
   }
 }
  //runs the add method, storing results in matrix c
  c = addMatrix(a, b);
  
  //labels results
  System.out.println("The matrices are added as follows:");
  
  printMatrices(a, b, c);
  
  
}
//method that adds the matrices
public static double[][] addMatrix(double[][] a, double[][] b) {
  //checks that the matrices match the criteria
  if (a.length != b.length || a[0].length != b[0].length){
    return null;  
  }
   
 
  double[][] result = new double[b.length][a[0].length];
 
  for (int i = 0; i < result.length; i++) {
   for (int j = 0; j < result[0].length; j++) {
    result[i][j] = a[i][j] + b[i][j];
   }
 
  }
 
  return result;
 
 }
public static void printMatrices (double [][] a, double [][] b, double [][]c){
for (int i = 0; i < c.length; i++) {
   for (int j = 0; j < c[0].length; j++) {
 
    System.out.print(a[i][j] + " ");
    if (i == 1 && j == 2) {
     System.out.print(" + ");
    } else {
     System.out.print("   ");
    }
   }
   for (int j = 0; j < c[0].length; j++) {
    System.out.print(b[i][j] + " ");
    if (i == 1 && j == 2) {
     System.out.print(" = ");
    } else {
     System.out.print("   ");
    }
   }
   for (int j = 0; j < c[0].length; j++) {
    System.out.print(c[i][j] + " ");
   }
   System.out.println();
}
}
}

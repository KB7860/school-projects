/*
 * Kyle Brown
 * Exercise 22.11
 * Convex Hull
 * This program prompts the user to enter a set size and list of points,
 * then finds the points that form a convex hull
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Jamie
 */
public class Exercise22_11 {
public static void main (String[]args){

    System.out.print("How many points are in the set? ");
    Scanner scan = new Scanner(System.in);
    int n = (int)scan.nextInt();
    double [][] points = new double [n][2];
    System.out.print("Please enter the coordinates (x enter y): ");
    for (int count = 0; count < n; count ++){
        System.out.print("(");
        points[count][0] = (double)scan.nextDouble();
        System.out.print(", ");
        points[count][1] = (double)scan.nextDouble();
        System.out.print(") ");
        }
    System.out.println("");
    ArrayList<MyPoint> hull = getConvexHull(points);
    System.out.println("The convex hull is");
    for (MyPoint myPoint : hull) {
        System.out.print("( " + myPoint.x + ", " + myPoint.y + ") ");
    }
}

/*
Class declaration for the class MyPoint
*/
public static class MyPoint implements Comparable<MyPoint> {
double x;
double y;
MyPoint rightMostLowestPoint;

//constructor
MyPoint(double x, double y){
this.x = x;
this.y = y;
}

//setter for rightMostLowestPoint
public void setRightMostLowestPoint (MyPoint point){
rightMostLowestPoint = point;
}

@Override
public int compareTo(MyPoint o){
    MyPoint point1 = new MyPoint(rightMostLowestPoint.x+1, rightMostLowestPoint.y);
    double angle1 = getAngle(rightMostLowestPoint, point1, o);
    double angle2 = getAngle(rightMostLowestPoint, point1, this);
    if (angle2 > angle1) {
    return -1;
    }
    else if (angle2 > angle1){
    return 1;
    }
    else {
    double side1 = getSide(rightMostLowestPoint, o);
    double side2 = getSide(rightMostLowestPoint, this);
    if (side1 > side2){
    return -1;
    }
    else if (side2 > side1){
    return 1;
    }
    else {
    return 0;
    }
    }
}
}
public static ArrayList<MyPoint> getConvexHull (double[][] s){
    ArrayList<MyPoint> oldPoints = new ArrayList<>();
    for (int count = 0; count < s.length; count++){
    oldPoints.add(new MyPoint(s[count][0], s[count][1]));
    }
    
    MyPoint p1 = oldPoints.get(0);
    for (int count = 0; count < oldPoints.size(); count ++){
    if (oldPoints.get(count).y > p1.y){
    p1 = oldPoints.get(count);
    }
    else if (oldPoints.get(count).y == p1.y){
        if (oldPoints.get(count).x > p1.x){
        p1 = oldPoints.get(count);
        }
    }
    }
    for (MyPoint myPoint : oldPoints) {
        myPoint.setRightMostLowestPoint(p1);
    }
    
    Collections.sort(oldPoints);
    
    LinkedList<MyPoint> points = new LinkedList<>();
    points.add(oldPoints.get(0));
    points.add(oldPoints.get(1));
    points.add(oldPoints.get(2));
    
    int i = 3;
    int n = oldPoints.size();
    while (i < n) {
    MyPoint t1 = points.removeLast();
    MyPoint t2 = points.getLast();
    points.add(t1);
    MyPoint p = oldPoints.get(i);
    if (isLeft(p, t1, t2)) {
        points.add(p);
        i++;
    }
    else {
    points.removeLast();
    }
    }
    return new ArrayList<MyPoint>(points);
    
}
public static boolean isLeft(MyPoint p1, MyPoint p2, MyPoint p3){
double pos = (p2.x - p1.x) * (p3.y - p1.y) - (p3.x - p1.x) * (p2.y - p1.y);
if (pos > 0) {
return true;
}
else {
return false;
}
}
public static double getSide(MyPoint p1, MyPoint p2) {
return Math.sqrt((p2.x - p1.x) * (p2.y - p1.y) + (p2.y - p1.y) * (p2.y) - p1.y);
}
public static double getAngle (MyPoint p1, MyPoint p2, MyPoint p3) {
double a = getSide(p2, p3);
double b = getSide(p1, p3);
double c = getSide(p1, p2);
return Math.toDegrees(Math.acos((a*a - b*b - c*c) / (-2*b*c)));
}
}


package project20_18;

/**
 *
 * @author Kyle Brown
 * @title Project 20_18
 * In this program, I test the average number of probes required for various
 * table sizes containing 10000 random numbers. 
 */
public class Project20_18 {

    public static void main(String[] args) {
        System.out.println("Creating values");
        LinearProbingHashTable t1 = new LinearProbingHashTable (100000);
        LinearProbingHashTable t2 = new LinearProbingHashTable (50000);
        LinearProbingHashTable t3 = new LinearProbingHashTable (33333);
        LinearProbingHashTable t4 = new LinearProbingHashTable (25000);
        LinearProbingHashTable t5 = new LinearProbingHashTable (20000);
        LinearProbingHashTable t6 = new LinearProbingHashTable (16666);
        LinearProbingHashTable t7 = new LinearProbingHashTable (14286);
        LinearProbingHashTable t8 = new LinearProbingHashTable (12500);
        LinearProbingHashTable t9 = new LinearProbingHashTable (11111);
        populate(t1);
        populate(t2);
        populate(t3);
        populate(t4);
        populate(t5);
        populate(t6);
        populate(t7);
        populate(t8);
        populate(t9);
        System.out.println(".1: " + t1.getAverage());
        System.out.println(".2: " + t2.getAverage());
        System.out.println(".3: " + t3.getAverage());
        System.out.println(".4: " + t4.getAverage());
        System.out.println(".5: " + t5.getAverage());
        System.out.println(".6: " + t6.getAverage());
        System.out.println(".7: " + t7.getAverage());
        System.out.println(".8: " + t8.getAverage());
        System.out.println(".9: " + t9.getAverage());
    }
    public static void populate (LinearProbingHashTable table) {
        for (int count = 0; count < 10000; count ++) {
            Integer temp = (int) (Math.random()*10000);
            String var1 = temp.toString();
            Integer temp2 = temp.hashCode();
            String var2 = temp2.toString();
            table.insert(var1, var2);
        }
    }
    
}

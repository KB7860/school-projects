package project19_41;

import java.util.TreeSet;

/**
 *
 * @author Kyle Brown
 * This class tests the testRank method for various values of N
 */
public class Project19_41 {

        public static void main(String[] args) {
        System.out.println("10000: " + run(10000) + " ... " + Math.log(10000));
        System.out.println("20000: " + run(20000) + " ... " + Math.log(20000));
        System.out.println("30000: " + run(30000) + " ... " + Math.log(30000));
        System.out.println("40000: " + run(40000) + " ... " + Math.log(40000));
        System.out.println("50000: " + run(50000) + " ... " + Math.log(50000));
    }
    public static void testRank (int N) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        
        for (int i = 1; i<= N; i++) {
            t.add(i);
        }
        
        for (int i = 1; i<=N; i++) {
        if(t.headSet(i,true).size()!=i) {
            throw new IllegalStateException();
        }
        }
    }
    public static long run (int N) {
        long startTime = System.nanoTime();
        testRank(N);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        return (totalTime/1000000000);
    }
}

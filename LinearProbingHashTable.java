
package project20_18;

/**
 *
 * @author Kyle Brown
 * @title LinearProbingHashTable
 * This contains the implementation of the linear probing hash table
 */
public class LinearProbingHashTable {

    private int currentSize, maxSize;       
    private String[] keys;   
    private String[] vals;
    private int[] probes;
    private int probeCount;
    private int probeIndex;
    private int probeAverage;
 
    public LinearProbingHashTable(int capacity) 
    {
        currentSize = 0;
        maxSize = capacity;
        keys = new String[maxSize];
        vals = new String[maxSize];
        probes = new int[10000];
        probeCount = 0;
        probeIndex=0;
    }  
 
    public void makeEmpty()
    {
        currentSize = 0;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }
 
    public int getSize() 
    {
        return currentSize;
    }
 
    public boolean isFull() 
    {
        return currentSize == maxSize;
    }
 
    public boolean isEmpty() 
    {
        return getSize() == 0;
    }
 
    public boolean contains(String key) 
    {
        return get(key) !=  null;
    }
 
    private int hash(String key) 
    {
        return key.hashCode() % maxSize;
    }    
 
    public void insert(String key, String val) 
    {                
        int tmp = hash(key);
        int i = tmp;
        probeCount=0;
        
        do
        {
            //increments counter
            
            if (keys[i] == null)
            {
                probeCount++;
                keys[i] = key;
                vals[i] = val;
                currentSize++;
                probes[probeIndex] = probeCount;
                probeIndex++;
                return;
            }
            if (keys[i].equals(key)) 
            { 
                probeCount++;
                vals[i] = val;
                probes[probeIndex] = probeCount;
                probeIndex++;
                return; 
            }
            probeCount++;            
            i = (i + 1) % maxSize;            
        } while (i != tmp);
        
        
    }
 
    public String get(String key) 
    {
        int i = hash(key);
        while (keys[i] != null)
        {
            
            if (keys[i].equals(key))
                return vals[i];
            i = (i + 1) % maxSize;
        }            
        return null;
    }
    
    public float getAverage () {
        float average = 0;
        for (int i =0; i<10000; i++) {
        average = average + probes[i];
        }
        float ave = (average/10000);
        return ave;
    }
    
 
    public void remove(String key) 
    {
        if (!contains(key)) 
            return;
 
        int i = hash(key);
        while (!key.equals(keys[i])) 
            i = (i + 1) % maxSize;        
        keys[i] = vals[i] = null;
 
        for (i = (i + 1) % maxSize; keys[i] != null; i = (i + 1) % maxSize)
        {
            String tmp1 = keys[i], tmp2 = vals[i];
            keys[i] = vals[i] = null;
            currentSize--;  
            insert(tmp1, tmp2);            
        }
        currentSize--;        
    }       
 
    public void printHashTable()
    {
        System.out.println("\nHash Table: ");
        for (int i = 0; i < maxSize; i++)
            if (keys[i] != null)
                System.out.println(keys[i] +" "+ vals[i]);
        System.out.println();
    }   

}

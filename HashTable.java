
package project20_17;

/**
 *
 * @author Kyle Brown
 * @title HashTable
 * This class implements the necessary HashTable operations
 */
public class HashTable {
    private final static int TABLE_SIZE = 135054;

      HashEntry[] table;

      HashTable() {
            table = new HashEntry[TABLE_SIZE];
            for (int i = 0; i < TABLE_SIZE; i++)
                  table[i] = null;
      }

 

      public String get(int key) {
            int hash = (key % TABLE_SIZE);
            while (table[hash] != null && table[hash].getKey() !=key)
                  hash = (hash + 1) % TABLE_SIZE;
            if (table[hash] == null)
                  return ("This table does not contain the specified string");
            else
                  return table[hash].getValue();
      }


      public void put(int key, String value) {
            int hash = (key % TABLE_SIZE);
            while (table[hash] != null && table[hash].getKey() != key)
                  hash = (hash + 1) % TABLE_SIZE;
            table[hash] = new HashEntry(key, value);

      }
}

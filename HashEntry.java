
package project20_17;

/**
 *
 * @author Kyle Brown
 */
public class HashEntry {
    private int key;

      private String value;

      HashEntry(int key, String value) {
            this.key = key;
            this.value = value;
      }     
 
      public int getKey() {
            return key;
      }

      public String getValue() {
            return value;
      }
}

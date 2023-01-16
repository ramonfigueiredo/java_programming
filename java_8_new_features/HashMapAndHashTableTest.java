import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap and Hashtable store key and value pairs in a hash table.
 * When using a Hashtable or HashMap, we specify an object that is used as a key and the value that you want to be
 * linked to that key.
 * The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
 * Now let us discuss with the help of an example.
 *
 * Hashmap vs Hashtable
 *
 * HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code
 * Hashtable is synchronized. It is thread-safe and can be shared with many threads.
 *
 * HashMap allows one null key and multiple null values
 *
 * Hashtable doesn’t allow any null key or value.
 *
 * HashMap is generally preferred over HashTable if thread synchronization is not needed.
 */
public class HashMapAndHashTableTest {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("A", "aaa");
        myMap.put("B", "bbb");

        System.out.println("Print Method 1: Using a for loop to iterate through a HashMap. Print using for(Map.Entry<String, String> set: myMap.entrySet()) {");
        for(Map.Entry<String, String> set: myMap.entrySet()) {
            myMap.entrySet();
            System.out.println(set.getKey() + ": " +  set.getValue());
        }

        System.out.println("Print Method 2: Using a forEach to iterate through a HashMap (Lambda)");
        myMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("Print Method 3: Using an iterator to iterate through a HashMap.");

        Iterator<Map.Entry<String, String>> newIterator = myMap.entrySet().iterator();
        while (newIterator.hasNext()) {
            Map.Entry<String, String> mapEntry = (Map.Entry<String, String>) newIterator.next();
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
    }
}

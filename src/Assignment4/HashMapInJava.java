package Assignment4;
/**
 * Importing class, which are belong from java.util.package;
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * 
 * @author Vishwas
 * creating class HashMapInJava, this class will create..
 * HashMap object and performing the following functionalities:
 * Adding key-value pairs to the HashMap object..
 * Retrieving all the keys present in the HashMap.
 * Retrieving all the values present in the HashMap. 
 * Making the HashMap as Synchronized.
 *
 */
public class HashMapInJava {
	// main method
public static void main(String[] args) {
  /**
   * In here creating a HashMap Object(hashMap)
   * and inserting some key value..
   */
  HashMap < String, String > hashMap = new HashMap < String, String > ();
  hashMap.put("Sushant", "Vishwas");
  hashMap.put("Raju", "Majumdar");
  hashMap.put("Sid", "Kumar");
  hashMap.put("Amit", "Roy");
  hashMap.put("Sam", "Das");
  hashMap.put("Pradeep", "Yadav");
  hashMap.put("Sameer", "Sethi");
  /**
   * in here Synchronizing the HashMap Explicitly..
   * by using The synchronizedMap() method is used to.. 
   * return a synchronized (thread-safe) map backed by the specified map.
   */
  Map map = Collections.synchronizedMap(hashMap);
  synchronized(hashMap) {
   Set < String > ky = hashMap.keySet(); 
   System.out.println("------Print the keys-------");
   
   for (String key: ky) {
    System.out.println(key);
   }
   Set set = hashMap.entrySet();
   //In here creating an Iterator Object..
   Iterator itr = set.iterator();
   //Window console for values
   System.out.println("\n--------Print the values -------");
   while (itr.hasNext()) {
    Map.Entry maP = (Map.Entry)itr.next();
    System.out.println(maP.getValue());
   }
  }
}
}
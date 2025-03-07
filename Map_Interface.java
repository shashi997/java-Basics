import java.util.HashMap;
import java.util.Map;

// Map interface has Hashmap, Hashtable classes both are almost same except Hashtable is synchronised(Multiple thread used)
// then we could use Hashtable otherwise we can use Hashmap everywhere.
// also if we want to use HashMap on multiple threads then you can synchronize externally.
public class Map_Interface {
    public static void main(String[] args) {
        // Map interface has key and value as types and it has class of HashMap
        Map<String, Integer> students = new HashMap<>();

        // assigning key and values to students. Keys are unique
        students.put("Shashi", 87);
        students.put("Hari", 47);
        students.put("Kiran", 91);
        students.put("Jimmy", 56);
        students.put("Kiran", 95);      // we updated kiran value from 91 to 95.

        System.out.println(students.get("Hari"));   // 47 - value of hari
        System.out.println(students);

        // we get keys of students.
        System.out.println(students.keySet());

        //looping and getting keys and values with keys.
        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }

    }
}

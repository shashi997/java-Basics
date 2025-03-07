public class string_learn {
    public static void main(String[] args) {
        
        
        // Generally string name in stack memory and stores adress of the object in heap memory.
        String name = new String("Jimmy");  // Passing value to the string constructor.
        System.out.println("Hello " + name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" walton"));

        // String name = "Jimmy";

        // Mutable vs immutable string

        //     Immutable string -- Unchange

        // Every time we create a string variable stores in stack and adress of the heap.
        // Every string store in heap a special place called "String constant pool" we cannot change it.
        String name1 = "Harry";    // suppose it has an adress of 101 value = "harry"
        name1 = name1 + " potter"; // in this we are changing the adress to 105 value = "harry potter". 
        // then after sometime the garbage collection removes adress 101.
        System.out.println("hello " + name1);

        String s1 = "Ryan";  // Here both s1 and s2 have same so s2 chooses the same adress as s1.
        String s2 = "Ryan";  // since both are same it does not create another even if we use multiple times same value.


        System.out.println(s1 == s2);

        //    muttable string -- change ( StringBuffer or StringBuilder ).

        StringBuffer sb = new StringBuffer("Tom");  // StringBuffer takes spcae more of 16 bytes.
        System.out.println(sb.capacity());  // empty string it takes up 16 bytes and we entered "Tom" so capacity increases to 19 bytes.
        System.out.println(sb.length());
        sb.append(" Cruise");
        System.out.println(sb);

        // String str = sb.toString();  // Here it converts the StringBuffer into String type.
        // There are many things/methods to do with StringBuffer 
        // String Buffer is thread safe and where as the StringBuilder is not a thread safe.
    }
}

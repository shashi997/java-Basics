public class logical_operators {
    public static void main(String[] args) {
        
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

    //    boolean result = x > y && a > b ;   // false
        boolean result = x > y || a > b || a > 1;     // true
        boolean result1 = x > y && a < b ;    // true
        System.out.println(result);
        System.out.println(result1);

        boolean result2 = a > b ;  //false
        System.out.println(!result2);  // true due to exclamation (not operator)
    }
}

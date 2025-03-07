
public class type_conversion {
    public static void main(String[] args) {
        
        byte b = 127;
        int a = b;       // Type conversion (or) implicit conversion

        int i = 12;
        byte k = (byte) i;        // Type Casting (or) explicit conversion

        float f = 5.6f;
        int j = (int) f;
        
        System.out.println(b);
        System.out.println(a);
        System.out.println(k);

        System.out.println(j);

        byte b1 = 20;
        byte b2 = 30;
                                // known as type promosion
        int result = b1 * b2;   // when multiplied value goes out of range in byte so java promotes the byte to int.

        System.out.println(result);
        
    }
}

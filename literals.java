public class literals {
    public static void main(String[] args) {
        
        // literals

        int num0 = 35; 
        int num1 = 0b101;  // 5 Binary
        int num2 = 0x7E;  // 126 Hexa decimal
        int num3 = 10_00_00_000;  // Easy to count zeros 

        System.out.println(num0);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        char c = 'a';
        System.out.println(c);
        c++;
        System.out.println(c);  // c = 'b'
    }
}

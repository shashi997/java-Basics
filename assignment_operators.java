public class assignment_operators {
    public static void main(String[] args) {
        
        int num1 = 78;
        int num2 = 45;

        int result = num1 % num2;

        
        System.out.println(result);

        // num1 = num1 + 2;  // We get 80 
        num1 += 2;

        System.out.println(num1);

        // num1 += 1;
        num1++;      //increment  post increment
        //num2--;      //decrement  post decrement

        --num2;  // pre decrement
        // ++num2 // pre increment


        System.out.println(num1);

        System.out.println(num2);

        int n1 = 45;
        int n2 = 45;

        int result1 = ++n1;
        int result2 = n2++;

        System.out.println("pre increment : " + result1); 
        System.out.println("post increment : " + result2);

    }
}

public class conditional_statements {
    public static void main(String[] args) {
        
        int x = 18 ;

        if(true){
            System.out.println("Hi");       // this statement always print cause of true in if statement.
        }
        if (x>10 && x<=20) {
            System.out.println("Hello");
        }
        else {
            System.out.println("Bye");
        }


        int a = 8;
        int b = 7;
        int c = 9;

        if(a > b && a > c)
        {
            System.out.println(a);
            System.out.println("Thank you");
        }
        else if(b>c)
            System.out.println(b);
        else 
            System.out.println(c);            // for single statement no need to place curly braces 
    }
}

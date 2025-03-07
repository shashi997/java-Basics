public class while_loop {
    public static void main(String[] args) {
        
        int i = 1;

        while(i<=5) //true
        {
            System.out.println("Hello " + i);
            int j = 1;
            while(j<=3){
                System.out.println("Hi");   // for every single hello it prints hi 3 times.
                j++;
            }
            i++;
        }

        System.out.println("Bye " + i);
    }
}

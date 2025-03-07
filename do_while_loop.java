public class do_while_loop {
    public static void main(String[] args) {
        
        int i = 1;    // (5,6,7....) > 4 then it fails condition but execute once. 

        do{
            System.out.println("hello " + i);       // print 1 time even in both true/false condition.

            i++;
        }while(i<=4);
    }
}

public class for_loop {
    public static void main(String[] args) {
        
        for(int i=4;i>=1;i--)
        {
            System.out.println("Hello " + i);
        }



        for(int j=1;j<=5;j++)
        {
            System.out.println("Day " + j);

            for(int k=1;k<=9;k++)
            {
                System.out.println("  " + (k+8) + " - " + (k+9));
            }
        }
    }
}

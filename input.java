// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

import java.util.Scanner;

public class input {
    public static void main(String[] args) //throws IOException
    {
        System.out.println("Enter a number");
        
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());  //readLine() generates IO Exception.
        // System.out.println(num);

        // The above method is old way of implementation
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}

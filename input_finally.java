import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input_finally {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        // BufferedReader br = null;
        // try{
        //     InputStreamReader in = new InputStreamReader(System.in);
        //      br = new BufferedReader(in);            // we are installing above the BufferedReader so no need to instalise again.
        //     num = Integer.parseInt(br.readLine());  //this throws exception.
        //     System.out.println(num);
        // }
        // finally can be used when we used try block the finally block used to close the resources/connection and it does 
        // either it cathes an exception or not.
        // it can be used in advanced java for closing connections for input, database, network etc...
        // finally     
        // {
        //     br.close();
        // }
        
        // when we mention the in try block it automatically closes the resources.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter Number : ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}

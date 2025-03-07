public class multidimensional_array {
    public static void main(String[] args) {
        
        int nums[][] = new int[3][4]; // this contain 3 array which each array contain 4 elements.
        // this Math.random returns double and values between 0.0 and 1.0 so we multiply by 100 to get 1 to 100 
        // random values and explicit converion to convert double to int. We convert after calculation by 100 to int.
        // int random = (int)(Math.random() * 100); 

         for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random() * 100);   // assigns random values from 0 to 100 and inserting values to the array.
            }
        }

        // printing the array values 

         for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();

        // to brief understand underneath print array with index.

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println("Index of array "+  i + " and " + j + " element is : "  + nums[i][j]);
            }
            System.out.println();
        }

        // enhanced for loop / For each loop.
        // syntax is for( TYPE VAR_NAME : ArrayList/Array ) {   
        //    ....   }
        // In each iteration, the varibale VAR_NAME will hold the value of an element inside the ArrayList/Array,
        // starting from first element and continue until it reaches its end of ArrayList/Array .

        for(int n[] : nums)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

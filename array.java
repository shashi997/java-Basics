public class array {
    public static void main(String[] args) {
        
        int num[] = new int[4];    // array creation when we don't know the values 
        num[0] = 45;               // array indexing starts from 0 to n-1.
        num[1] = 38;
        num[2] = 84;
        num[3] = 94;

        for(int i=0;i<4;i++){
            System.out.println("First array : " + i + " index " + num[i]);
        }
        
       // once created array we can modify to the elements on the array
       // also the size of array is constant it does not allocate dynamically.

        int nums[] = {3,8,7,4,5};   // array when we know the values 
        for(int j=0;j<5;j++){
            System.out.println("Second array : " + j + " index " + nums[j]);
        }
        
        nums[1] = 45;

        System.out.println(nums[1]);

        // enhanced for loop / For each loop
        System.out.println("Enhanced for loop :");
        for(int m : num){
            System.out.print(m + " ");
        }

        System.out.println();

        for(int n : nums){
            System.out.print(n + " ");
        }

    }
}

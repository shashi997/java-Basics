public class jagged_array {
    public static void main(String[] args) {
        
        int nums[][] = new int[3][];    //jagged array

        nums[0] = new int[3];   // at 0th index array we giving 3 elements size.
        nums[1] = new int[4];   // at 1st index array we giving 4 elements size.
        nums[2] = new int[2];   // at 2nd index array we giving 2 elements size.

        // inserting values 
        for(int i=0;i<3;i++){
            for(int j=0;j<nums[i].length;j++){            // every array is different length of elements so we use length function. 
                nums[i][j] = (int)(Math.random() * 10);   // assigns random values from 0 to 10 and inserting values to the array.
            }
        }

        // printing values using enhanced for loop
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // Multi dimensional array / 3d array. 
        // int nums[][][] = new int[3][4][];  

    }
}

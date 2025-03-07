class student
{
    int rollno;
    String name;
    int marks;
}



public class array_of_objects {
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "Jimmy";
        s1.marks = 84;

        student s2 = new student();
        s2.rollno = 2;
        s2.name = "Ramesh";
        s2.marks = 54;

        student s3 = new student();
        s3.rollno = 3;
        s3.name = "Harry";
        s3.marks = 67;

        // System.out.println(s1);  // it does not print correctly.
        // System.out.println(s1.name + " " + s1.rollno);  // this is actually to print the instance variables
        // it will be diffitcult to print for every object variable if more objects were present.
        // that's why we store the objects inside of an array.

        student people[] = new student[3];   // Creating an array which can hold student references/objects.
        people[0] = s1;
        people[1] = s2;     // assigning the objects to the array
        people[2] = s3;
    
        // for(int i=0;i<people.length;i++){
        //     System.out.println(people[i].name + " : " + people[i].marks );
        // }

        for(student stud : people){
            System.out.println(stud.name + " : " + stud.marks);
        }
    
    
    
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 5;
        nums[3] = 1;

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        for(int n : nums){
            System.out.print(n + " ");
        }


    }
}

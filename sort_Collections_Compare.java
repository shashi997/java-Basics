import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// if we want to sort based on our logic we use comparator 
// gives class itself to compare we use Comperable interface.

class students implements Comparable<students>
{
    int age;
    String name;
    

    public students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "students [age=" + age + ", name=" + name + "]";
    }

   // implementing our own comparator for this class.
    public int compareTo(students that) {
        if(this.age > that.age)     // we are in same class so we are comapring ourselves so this used.
            return 1;
        else
            return -1;
    }

}


public class sort_Collections_Compare {
    public static void main(String[] args) {
        // Comparator interface has a method compare used to compare on our own way.
        // since we are creating in anonymous class we need to declare type in right side also.
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i,Integer j)
            {
                if(i%10 > j%10)     // we are comparing last digit of number for comaparing
                    return 1;
                else
                    return -1;
            }
        };
        
        // if we mentioned type on leftside that's it there is no need for declaring type again on right side.
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        // Collections class has sort method.
        Collections.sort(nums, com);    // com object of comparator for own comparison by last digits.

        System.out.println(nums);

        System.out.println();
        // using anonymous class            // ternary operator
         Comparator<students> com1 = ( i, j) -> i.age > j.age?1:-1;
        

        List<students> nums1 = new ArrayList<>();
        nums1.add(new students(20, "Shashi"));
        nums1.add(new students(24,"Jimmy"));
        nums1.add(new students(18, "Harish"));
        nums1.add(new students(15,"David"));

        Collections.sort(nums1, com1);  // sorting with age


        for(students s : nums1)
            System.out.println(s);

        System.out.println();

        Collections.sort(nums1);    // here we are implementing our own compareTo in our class so no need for comparator.

        for(students s1 : nums1)
            System.out.println(s1);

        
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class stream1 {
    public static void main(String[] args) {
        // List with type interger and instead of ArrayList we used Arrays in which we assign values directly with aslist method.
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        
        // for printing values in array

        // Normal for loop
        // for(int i=0;i<nums.size();i++)
        // {
        //     System.out.println(nums.get(i));
        // }
        
        // enhanced for loop
        // for(int i : nums)
        // {
        //     System.out.println(i);
        // }

        // Consumer is interface which is Functional interface so we can use lambda expression.
        // it has of only method to work with is accept();
        // Consumer<Integer> con = n -> System.out.println(n);
        // we are assigning the value to con then we just copy the value and type in forEach
  
        // nums.forEach(n -> System.out.println(n));

        // forEach method also takes object of consumer.
        // in this forEach goes through each element and gives to n and we print.
        // nums.forEach(n -> System.out.println(n));
        
        // nums.stream returns the object of Stream so we create a Steram s1 and store the object.
        Stream<Integer> s1 = nums.stream();
        // calling forEach method with Stream s1.
        // we can only use Stream s1 once. We cannot use multiple s1 so we create s2,s3...any name.
        s1.forEach(n -> System.out.print(n + " "));
        // s1.forEach(n -> System.out.println(n));      // we get RunTime Error.

        System.out.println();

        Stream<Integer> s2 = nums.stream();
        // here filter method called by Stream s2 which filters just like below code and returns an Stream Object.
        Stream<Integer> s3 = s2.filter(n -> n%2==0);

        // s3.forEach(n -> System.out.print(n + " "));

        // filter and double the values
        Stream<Integer> s4 = s3.map(n -> n*2);

        // s4.forEach(n -> System.out.print(n + " "));
        // reduce method returns an integer not an object so we stored in int and called with s4.
        int result = s4.reduce(0, (c,e) -> c+e);

        System.out.println(result);
        // filter takes object of predicate and has a method of test. and it lambda expression
        Predicate<Integer> p = n -> n%2==0;
            
        
        // we can put p object in filter
        // .filter(p)

        // similarly map need object of FUnction is Functional Interface which takes 2 types and method apply().
        // Function<Integer, Integer> fun = new Function<Integer,Integer>() {

        //     @Override
        //     public Integer apply(Integer t) {
        //         return t*2;
        //     }

        Function<Integer, Integer> fun = t -> t*2;

        // we can put fun in map
        // .map(fun)

        // .reduce(intialise, (carry,element) -> carry + element)
            
        

        // we can use Stream also like this
        int result1 = nums.stream()
                            .filter(n -> n%2==0)
                            .map(n -> n*2)
                            .reduce(0, (c,e) -> c+e);


        System.out.println(result1);

        // parllelStream for executing simuntaneously with Threads.
        Stream<Integer> sortedValues = nums.stream()
                            .filter(n -> n%2==0)
                            .sorted();

        sortedValues.forEach(n -> System.out.println(n));


        
        
        System.out.println();
              
        int sum = 0;

        for(int n : nums)
        {   // filter even numbers and multiply.
            if(n%2==0)
            {
                n = n*2;
                sum = sum + n;
            }
        }

        System.out.println(sum);
    }
}



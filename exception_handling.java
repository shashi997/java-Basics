// errors are of 3 types 1) Compile time error   2) Run time error  3) Logical error

public class exception_handling {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        int nums[] = new int[5];
        String str = null;
        
        try {       // Once it caught an excpetion it exit the block.
            j = 18/i;       // we get (Arthmetic) exception since we are dividing the number with zero 
            System.out.println(str.length());   // finding length of null string gives an exception.
            System.out.println(nums[1]);
            System.out.println(nums[5]);    // index out of bound exception.

        }
        catch (ArithmeticException e) {   // exception class has the bunch of exceptions ArthmeticException catches exception only from 
            // arthematic ones not from arrays or any other. while exception class caught all exceptions.
            // hello 
            System.out.println("Cannit divide by zero " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){    // ArrayIndexOutOfBoundsException fro array
            System.out.println("Stay in limit of the length of Array. ");
        }
        catch(Exception e){     // Exception is parent class of all exceptions.
            System.out.println("Something went wrong.. " + e);
        }
// we should place the parent exception class at end of all catch excptions because it will catch any exception at start 
// and the reamining exceptions are caught before getting to their catch and error will generate

        System.out.println(j);

        System.out.println("Bye");
    }
}


// above all classes there is "object" class and extending to "throwable" class 
// throwable class is divided into 2 types ->  1) error    2) Exception
// errors class we cannot handle like threadDeath, IOError, OutOfMemory etc..
// Excptions can be catogorised mainly into 2 types ->  UnChecked Exceptions and Checked Exceptions.
// Unchecked exceptions like Runtime exceptions which are ArthimaticException, ArrayOutOfIndexBound.., NullPointer etc..
// which can handled/not chosen by user programmer but 
// the checked excpetions like SQL Exception, IO Exception are should be defined definietly by the user otherwise it throws 
// an error like forName() in JDBC throws exception without that we get an error.

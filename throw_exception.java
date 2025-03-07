
class MathsException extends RuntimeException{      // we creating our own exception class that extends from the parent class
    // of exception/RuntimeException.
    public MathsException(String string){   // Constructor of MathsException class 
        super(string);      // we are passing the string in throw keyword to parent class that will do pass the exception
        // to the catch method and we know by printing exception.
    }
}


public class throw_exception {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18/i;
            if (j==0) {
                // we can throw the builtin exceptions like ArthmaticExcption (or) our own exception created by the user.
                throw new MathsException("I don't want to print zero.");    
            }
        }
        catch(MathsException e) {   // we are cathcing the exception by the user created.
            j = 18/1;
            System.out.println("that's the default output. " + e);
            
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong.. " + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}

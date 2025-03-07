
class A{
        // throws the exception means it is not handling the exception but instead throws
    // to someone who does it like here the object calling this method main method here use try catch method around that calling method.
    public void show() throws ClassNotFoundException    
    {
        Class.forName("throws1_exception");
    }
}

public class throws_exception {

    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();

        try {
            obj.show();     // when calling an checked excption we need to catch the error.
        } 
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();        // stack of exceptions will be shown.
        }


    }
}

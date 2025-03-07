class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}

public class anonymous_class
{
    public static void main(String[] args) {

        A obj = new A()     // anonymous class 
        {
            public void show()
         {
            System.out.println("in new show");
         }
        };

        obj.show();   // we call the anonymous methodwith this object

        A obj1 = new A();
        obj1.show();
        
    }
}
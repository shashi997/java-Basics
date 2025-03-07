// we cannot use the static on outer class throws an error
class ab
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }

    class ac
    {
        public void config()
        {
            System.out.println("in config");
        }

    }
}


public class inner_class {
    public static void main(String[] args) {
        
        ab obj = new ab();
        obj.show();
        // obj.config();        // cannot be accessed by outer class. 

        // ac obj1 = new ac();   // it gives error because it is inside of the class.
        
        ab.ac obj1 = obj.new ac();   // for denoting refernce of inner class we use ab.ac 
        // since the class inside of the class so for creating an object of inner class
        //  we need to create by using object of the outer class.
        obj1.config();

        // if the inner class static then we should use
        // static class ac
        // ab.ac obj1 = new ab.ac();

    }
}

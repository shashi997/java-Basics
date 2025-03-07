// interface is an abstract class every method in this class is abstrct method.

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A
{
    // int age;            // by default variables in interface are final and static. 
    int age = 44;
    String name = "Vadodara";

    void show();
    void config();
}

interface x
{
    void run();
}

interface y extends x   // when extending the interfaces to interfaces we use extend instead of implements.
{
    void sprint();
}

// we use "implements" alternate of "extends" and should implement every method in interface 
class B implements A,x     // we can impplement multiple interfaces unlike inheritence.
{

    public void show() {
        System.out.println("in show");
    }

    public void config() {
      System.out.println("in config");
    }

    public void run(){
        System.out.println("running...");
    }
    
}

public class interface1 {
    public static void main(String[] args) {
        
        // A obj = new B();
        A obj;                    // object intilisation
        obj = new B();             // object creation
        obj.show();
        obj.config();
        // obj.run();

        x obj1 = new B();
        obj1.run();

        System.out.println( A.name + " : "+ A.age);

        y obj2 = new y(){           // using anonymous classes for implementing the methods.
            public void sprint(){
                System.out.println("sprinting...");
            }

    
            public void run() {
                System.out.println("running in Y");
            }
        };

        obj2.sprint();
        obj2.run();      //  extend from the interface x but the implementation of the method in class B.
        // so we created an another implementation in Y.


        // A.age = 45;       // we cannot change the values because in interface variables are static and final and cannot be changed
        // once declared.
    }
}




// Every class in java extends from Object class (java.lang)

class A // extends Object
{

    public A() {
        super();
        System.out.println("In A");
    }

    public A(int n){
        super();
        System.out.println("In A int : " + n);
    }
}

class B extends A {
    
    public B(){
        // every constructor in java has a super method which call it's super class.
        super();  // it means call the constructor of the super class (class A).
        System.out.println("In B");   // that's why it prints In A.
    }

    public B(int n){
        super(5);   // this is also calls super class constructor but if we pass an paramater in super(5) then this will
        // call the parameterized constructor of class A(int n).
        
        System.out.println("In B int : " + n);
    }

    public B(String s){
        this();     // after executing the super method then "this" mehtod execute the constructor the same class(B).
        System.out.println("String constructor in B : " + s);

    }
}

public class super_method_and_this {
    public static void main(String[] args) {
        
        B obj = new B();  // when object is created it calls constructor as well as super method inside of a constructor.
        
        System.out.println();

        B obj1 = new B(5);

        System.out.println();

        B obj2 = new B("Ravi");

    }
}

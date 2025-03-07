// polymorphism means many behaviours and there are 2 types of polymorphism.
// Compile time polymorphism and run time polymorphism.
// behaviour defined at compile time (Overloading) is called compile time polymorphism.
// behaviour defined at runtime (Overriding) is called run time polymorphism.

class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("In B show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("In C show");
    }
}


public class polymorphism {
    public static void main(String[] args) {
      
        A obj = new A();  // A is refernce of superclass and B() is the object of sub class.
        obj.show();

        // here we are not creating an stack variable but just changing the reference address of the same object. 
        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // THis methods are deciding which method to take at runtime known as runtime polymorphism
        // this methods known as dynamic method dispatch.
    }
    
}

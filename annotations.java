// there are different annotations apply to methods, variables and classes and the annotations can be used widely when using 
// frame works and working on a project ..
class A
{
    public void showDataBelonsToThisClass()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    // when we generate an override method for this extended class it default gives @override annotation.

    @Override       // this annotation checks the given method overriding the method in extended(A) class or not
    public void showDataBelonsToThisClass() {       // if not same name/error it gives error before compiling.
        System.out.println("in B show");
    }
    
}


public class annotations {
    public static void main(String[] args) {
        
        B obj = new B();
        obj.showDataBelonsToThisClass();
        
    }
}

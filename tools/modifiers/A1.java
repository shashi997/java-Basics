package tools.modifiers;

class launch{
    public void abc(){
        A1 obj = new A1();
        System.out.println(obj.name);   // protected works in the same package not works in other packages directly.
    }
}

public class A1 {
    public int marks = 10;

    protected String name = "Jack";  // we cannot use outside of package directly.

    public void show(){

    }
}

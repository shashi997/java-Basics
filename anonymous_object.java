class A {

    public A(){
        System.out.println("Object created ");
    }

    public void show(){
        System.out.println("in show method");
    }
}


public class anonymous_object {
    public static void main(String[] args) {
        
        int marks;  // it creates the instance variable in the stack and value is empty
        marks = 99;  // here it assigns the value of marks.

        A obj = new A();  // Here the obj is reference variable of the object and obj is in stack memory and value as 
        obj.show();       // the adress of the object  and object stores in heap memory.
        // Here the reference variable obj calls the object in heap memory for show method.

        System.out.println();

        // anonymous object
        new A(); // we are creating an object on the heap memory but there is nothing in stack as reference
        System.out.println();

        new A().show();  // we are accessing the methods without the reference variable this is called anonymous object.
        new A().show();
        
    }
}

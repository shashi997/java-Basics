import tools.modifiers.*;  // importing the tools folder inside of modifiers folder of all files. 

class C1 extends A1{
    public void abc(){
        System.out.println(name);   // protected can be accessed through the sub class.
    } 
}

public class access_modifiers {
    public static void main(String[] args) {
        
        A1 obj = new A1();  // in order to create object need to import b/c file inside of package.
        System.out.println(obj.marks);  // this marks is in public so we get access. if not we cannot access b/c of it is in
        // different package.
        // System.out.println(name);  // protected does not work in different package direfctly.
        obj.show();

        System.out.println();

        B1 obj1 = new B1();  // there is no need for importing anything b/c it is in same folder it is not in public but in default
        // even we can access it b/c in same package as B1.
        System.out.println(obj1.marks);

        // System.out.println(obj1.rank);   // it is not visible because rank is in private and cannot be accessed outside of class itself.

        
    }
}

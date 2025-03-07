

public class B1 {
    int marks = 72;  // if no acces modifier means it in default means it can access in same package.

    private int rank = 540; // the rank in private means it can only be accesed in class only  irrespective of the package
    // used in encapsulation and can access through getters and setters.

    public void show(){
        System.out.println(rank);   // can be accesed through same class (private)
    }


}

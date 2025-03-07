// there is no need for abstrct class should have an abstrat method it can have normal methods also..
abstract class car   // abstract method must be inside of an abstract class.
{
    public abstract void drive();   // abstract method when we don't know the implementation or other class has it's implementation
    // then we use abstract keyword for just declaring the method.

    public void playMusic()
    {
        System.out.println("play Music");
    }

}

class WagonR extends car  // when extending an abstract class we must implement the abstract methods inside of the abstract class.
{
    public void drive() // this is the mehtod of abstarct class and extending class.
    {
        System.out.println("Driving...");
    }
}

// for suppose we do not create abstract methods then we can make extending class an abstract class but that also means we 
// cannot create an object using this extending class because of the abstract keyword.
// then we need to create an another class and that should have the methods of these abstrct classes and  then we 
//  can create the object and use the methods.
// that class known as concrete class.

public class abstract1 {
    public static void main(String[] args) {
        
        // car obj = new car();  // we cannot crate an object for the abstract class.
        car obj = new WagonR();  // object of extended class of abstrct class and refernce of abstract class.

        obj.drive();
        obj.playMusic();
    }
}




class Aa
{
    public void show1()
    {
        System.out.println("in A show");
    }
}

class Bb extends Aa
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class up_down_casting {
    public static void main(String[] args) {
        
        Aa obj = new Bb();   // refernce of class Aa and object of Bb.
        obj.show1();
        // obj.show2();

        Aa obj1 = (Aa) new Bb();     // upcasting - even if we have object of Bb class but it refer to Aa class
        obj1.show1();
        // obj1.show2();        // here even if the object created from Bb but it refering to class Aa 
        // Aa does not the subclass exist or not so we cannot call methods of Bb.

        System.out.println();

        // downcasting 

        Bb obj2 = (Bb) obj;  // here "obj" is refernce of Aa but we are downcasting by Bb class.
        obj2.show1();
        obj2.show2();

        // Generally we call these up & down casting as type casting.

    }
}

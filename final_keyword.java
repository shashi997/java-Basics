// final - variable, method, class

// final class calc1 
class calc1 // when we use final class then it cannot form subclass (stoping inheritence).
{
    public final void show() // then this method cannot be overriden by any other methods
    {
        System.out.println("By Calc");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc1 extends calc1  // it cannnot extends from calc1 b/c it is final class.
{
    //  public void show()
    // {
    //     System.out.println("By AdvCalc1");
    // }   
}

public class final_keyword {
    public static void main(String[] args) {
        final int num = 10;   // num is constant(final) variable in which value cannot be changed 
        // num = 12;
        System.out.println(num);
        System.out.println();

        calc1 obj = new calc1();
        obj.show();
        obj.add(4,5);
        System.out.println();

        AdvCalc1 obj1 = new AdvCalc1();
        obj1.show();
        obj1.add(11,5);


    }
}

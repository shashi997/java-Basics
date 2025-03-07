// when we are in a scenario to use named constants we can use enum.
// enum cannot extended by another class everything else remains same we can create methods, constructors...
// By default enum extends the enum class.


enum Status{                                // Status is a class
    Running, Failed, Pending, Success;      // this 4 are objects of status
}

public class enum1 {
    public static void main(String[] args) {
        
        // int i = 5;
        Status s = Status.Running;      // just like int, Status here is an type
        System.out.println(s);
        System.out.println(s.getClass().getSuperclass());       // by automatically enum extends the java.lang.enum class.

        Status t = Status.Success;
        System.out.println(t.ordinal());

        Status[] ss = Status.values();      // the .values() returns a array of the all objects and stoing it in array ss. 
        for(Status sr : ss)
        {
            System.out.println(sr + " : " + sr.ordinal());
        }

        // System.out.println(ss[0]);

        Status p = Status.Pending;

        // by using switch it easier

        switch(p)
        {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }


        // by using if else

        if(p == Status.Running)
            System.out.println("All Good");
        else if(p == Status.Failed)
            System.out.println("Try Again");
        else if(p == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
    }
}

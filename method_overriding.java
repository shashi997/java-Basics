class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int multi(int n1, int n2){
        return n1 * n2;
    }
}

class AdvCalc extends Calc {           // Here we are getting methods add,multi from Calc class
    public int add(int n1, int n2){    // In Calc and AdvCalc both have "add" method this called method overriding 
        return n1 + n2 + 2;            
    }
}

public class method_overriding {
    public static void main(String[] args) {
        
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5,5);  // this add method called from AdvCalc class object so even though they have same name and 
        // variables it gives higher priority to it's own class, it takes add from AddCalc that's why it print 12 instead of 10.
        int r2 = obj.multi(6,8);  // it got from the Calc class(parent class of AdvCalc class).

        System.out.println(r1 + "  " + r2);

    }
}

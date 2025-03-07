
class calculator
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

        public int add(int n1, int n2)
    {
        return n1 + n2;
    }

        public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}


public class method_overloading {
    public static void main(String[] args) {
        
        calculator obj = new calculator();

        int r1 = obj.add(3,4);
        int r2 = obj.add(4,5,9);
        double r3 = obj.add(1.9,5);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}

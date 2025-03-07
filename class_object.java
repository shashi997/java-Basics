class calculator {
    
    int a; 

    //class method belongs to instance of class can accessed by an object (instance of class).

    public int add(int n1,int n2)              
    {
        int r = n1 + n2;
        return r;
    }

    // static method belongs to class itself so no need for creating an object.
    public static int sub(int s1,int s2)
    {
        int s = s1 - s2;
        return s;
    }
}



public class class_object {
    public static void main(String[] args) {
        
        int num1 = 4;
        int num2 = 5;

        // getting reference    = creating object cause object needs space/size.
        // with this object we can access methods of that class 
        calculator cal = new calculator();

        int result = cal.add(num1,num2);

        // for static methods no need to create object can access directly from class itself
        int result1 = calculator.sub(num1,num2);

        // int result = num1 + num2;

         System.out.println(result);
         System.out.println(result1);
    }
}

// every class inherits "object class" as default.
class Laptop
{
    String model;
    int price;

    String serial;

    // if we override the tostring method 
    public String toString()
    {
        return model + " : " + price;
    }

    public boolean equals(Laptop that)
    {
        if(this.model.equals(that.model) && this.price == (that.price))
        {
            return true;
        }
        else
            return false;
    }

}

class Laptop1
{
  
}

public class object_class {
    public static void main(String[] args) {
        
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yogi";
        obj.price = 1000;

        // System.out.println(obj);            // both will give same results 
        System.out.println(obj.toString());   
        // becuase when we create an object it calls "to string" 

        // we can generate code for tostring method in source action which is better in format and design.

        Laptop1 obj1 = new Laptop1();
        
        System.out.println(obj1);           // we get Laptop@5acf9800  means it showing us (classname @ hexstring(hashcode)).

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yogi";
        obj2.price = 1000;

      //  boolean result = obj == obj2;       // we get false even both object have same values
        boolean result = obj.equals(obj2);    // by both methods cause it compare with hexadecimal values not by values we define.
        // but we can override the equals method passing obj2 and compare values we get true.

        System.out.println(result);

        // we can generate by source action "Generate hashcode() and equals()" and select the variables to compare it will generate 
        // code that check them via multiple methods.
    }
}

class mobile {
    String brand;
    int price;
    static String name;

    // code inside this static block is executed only once: the first time the class is loaded into memory. 
    // irrespective of how many objects are created.
    static
    {
        name = "phone";
        System.out.println("In static block");
    }

    // Constructor calling
    public mobile(){
        brand = "";
        price = 25000;
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}


public class static_block {
    public static void main(String[] args) // throws ClassNotFoundException 
    {
        
        // Every time we create object it calls constructor but static : "name" intialise every time object created so 
        // put that in static block so it can execute once when class loaded into memory.
        // the class loads in special area in jvm known as """class loader""" contain all classes which are loaded
        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 95000;
        // mobile.name = "Smartphone";
        obj1.show();

        // When object is created two things happen "class loads" and "objects are instanced"
        // the class loads only once when first object created irrespective of how many objects are created.
        mobile obj2 = new mobile();
        obj2.show();


        // what if we don't create an object then the class not loads then static and constructor nothing will be called. So,

        // Class.forName("mobile");
        
        // This will not create an object but actually the system clas loader is used.
        // we need to throw an excpetion "throws ClassNotFoundException" beside public static void main.
    }
}

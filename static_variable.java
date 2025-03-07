class mobile {
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class static_variable {
    public static void main(String[] args) {
        
        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 95000;
        mobile.name = "Smartphone";

        // static variable can be called with class name not with objects name.

        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 75000;
        mobile.name = "Smartphone";

        mobile.name = "phone";
        // static variable is shared by all objects means a common variable shared to every object.
        // so by changing the obj1.name also affecting the obj2.name also die to static or common variable.
        // we are saving memory b/c not every object will have their own value.

        obj1.show();
        obj2.show();


    }
}

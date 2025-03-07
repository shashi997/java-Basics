class mobile {
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // we can acess the static variables inside the static method but we should not acess the instance variables inside 
    // the static method because the static method does not know which insatance variable belongs to which object (obj1, obj2).
    public static void show1(mobile obj){ 
           // we recieved which object to pick use the reference object and print the non satic varibales.
        System.out.println("in static method  ");
        System.out.println(obj.brand + " : " + obj.price + " : " + name);  
    }
}

public class static_method {
    //here we use static because to call main method ( Starting point execution of teh program ) without object.
    public static void main(String[] args) {
        
        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 95000;
        mobile.name = "smartphone";

        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 72000;
        mobile.name = "smartphone";

        mobile.name = "phone";

        obj1.show();
        obj2.show();

        // here are referencing which object should the static method should pick 
        mobile.show1(obj1);


    }
}


enum Laptop{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);       // we passing values to objects
    
    private int price;

    
    // this default constructor called only once by Surface
    private Laptop() {
        price = 500;
    }

    // this parameterized constructor called 3 times 
    private Laptop(int price) {
        this.price = price;
        System.out.println("in laptop " + this.name());
    }

    // getters and setters from source action
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    
}


public class enum2 {
    public static void main(String[] args) {
        
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        //enhanced for loop
        for(Laptop lap1 : Laptop.values())      // .values passes the array of values.
        {
            System.out.println(lap1 + " : " + lap1.getPrice());
        }

    }
}

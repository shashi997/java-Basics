// here we can use abstract class and method in computer class and extends the computer class for laptop, Desktop.
// we are using interface then we do not neeed public abstract method and we implement the computer class for laptop, Desktop.
interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer
{
    
    public void code()
    {
        System.out.println("code, compile, run, faster");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();  // the method will be called based on what object you're passing.
    }
}

public class need_of_inheritence {
    public static void main(String[] args) {
        
        Computer l1 = new Laptop();         // we are refering a computer class and object of Laptop and Desktop.
        Computer desk = new Desktop();

        Developer ram = new Developer();
        ram.devApp(desk);  
    }
}

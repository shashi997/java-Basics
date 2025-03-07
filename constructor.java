class human {
    private int age;
    private String name;

    // default constructor 
    public human(){  // this is constructor a special method same name as class will be called automatically when object is created.
        // System.out.println("In constructor ");
        age = 12;
        name = "John";
    }

    // parameterized constructor
    // public human(int a, String n)         // in this case there is no need for this keyword for parameterized constructor.
    public human(int age, String name){
        this.age = age;                        // we can also use this keyword inside of constructors also
        this.name = name;
    }

    public human(String s){     // only string 
        name = s;
        // age = 18;
    }

    public int getAge(){
        return age;
    }
  
    public String getName(){                     // This are Getters.
        return name;
    }

     public void setAge(int age){  
        this.age = age;    
    }                                           // This are setters

    public void setName(String name){  
        this.name = name;
    }
    

}

public class constructor {
    public static void main(String[] args) {
        
        human obj = new human();
        System.out.println("Default Constructor values : " + obj.getName() + " : " + obj.getAge());  // without assigning the values we get
        //  null for string and 0 for int  because of construcotrs but we have assigned so it takes it as default values.

        obj.setAge(45);
        obj.setName("Eric");

        System.out.println("Setter values : " + obj.getName() + " : " + obj.getAge());

        human obj1 = new human(22, "Jimmy");  // we are passing values so it will execute the parameterized constructor.

        System.out.println("Parameterized Constructor values : " + obj1.getName() + " : " + obj1.getAge());

        human obj2 = new human("Rocky");  // passing only a string to the constructor.

        System.out.println(obj2.getName() + " : " + obj2.getAge());



    }
}

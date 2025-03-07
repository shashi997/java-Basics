class human {
    // by using private acces modifier we can only use it inside of the class and cannot be acessed 
    // outside of class through objects unlike instance varibles 
    
    private int age = 22;
    private String name = "Jimmy";

    // the age and name can be acessed through this getAge and getName methods.
    public int getAge(){
        return age;
    }
  
    public String getName(){                     // This are Getters.
        return name;
    }

    // the age and name can be modified or assign values through the setAge and setname methods.
    public void setAge(int age){  
        this.age = age;    // this keyword refers to the current class instance variable.
    }                                            // This are Setters.

    public void setName(String name){   // Here age and name in Setters are local variables with same name as instance variables.
        this.name = name;               // it assigns the value to local variable itself if this keyword not used.
    }                                   // so that is why we use this keyword.
    

}


public class encapsulation {
    public static void main(String[] args) {

        human obj = new human();
        
        System.out.println(obj.getName() + " : " + obj.getAge());
        
        obj.setAge(45);
        obj.setName("Eric");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}

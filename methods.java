class computer {
    
    public void music()   // void = nothing to return
    {
        System.out.println("playing music...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 5){
            return "pen";
        }
        //once it returns something in a method it exit from the method.

        return "Nothing";
    }
}


public class methods {
    public static void main(String[] args) {

        computer obj = new computer();
        obj.music();                         // this music method don't have any return type.
        String str = obj.getMeAPen(2);  // less than 5 it will return "Nothing" and greater than 5 return "pen".
        System.out.println(str);
        
    }
}

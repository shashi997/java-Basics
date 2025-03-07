// When we create objects of classes in main method and compile then jvm generate each class in code
// generates a byte code(.class) file.
// inheritence can be also be done if each class be present in different files like Calc, AdvCalc and main class in different
// files even so we can create object in main method and create object and can use the methods and functions etc.. 

class Calc {                    // Calc(Super class) it is parent for the AdvCalc class.
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

    // Single level inheritece

class AdvCalc extends Calc{      // inheriting from the Calc class for add and sub methods.  AdvCalc(sub-class)
    public int multi(int n1, int n2){
        return n1*n2;
    }

    public int div(int n1, int n2){
        return n1/n2;
    }
}

    // Multi level inheritence (we inherited from AdvCalc class which inherited from Calc class ).

class VeryAdvCalc extends AdvCalc{
    public double power(int n1, int n2){
        return Math.pow(n1,n2);
    }
}

public class inheritence {
    public static void main(String[] args) {
        
        Calc obj = new Calc();  // creating a object from Calc class.
        int r1 = obj.add(52,25);
        int r2 = obj.sub(64,51);

        System.out.println(r1 + "  " + r2);

        System.out.println();

        AdvCalc obj1 = new AdvCalc();    // Here i can not execute the add and sub methods because there are in Calc class 
        // so i need to extend or inherit the Calc class methods to AdvCalc class 

        int r3 = obj1.add(52,25);
        int r4 = obj1.sub(64,51);
        int r5 = obj1.multi(5,7);
        int r6 = obj1.div(48,4);

        System.out.println(r3 + "  " + r4 + "  " + r5 + "  " + r6);

        System.out.println();

        // In here if we inherit the Calc then it will only have add and sub but not multi and div methods in AdvCalc.
        // So we inheriting from the Advcalc because it inherited the Calc class so we get both class features from inheriting 
        // one class of AdvCalc we get both class features add, sub, multi, div. 
        VeryAdvCalc obj2 = new VeryAdvCalc();
        int r7 = obj2.add(52,25);
        int r8 = obj2.sub(64,51);
        int r9 = obj2.multi(5,7);
        int r10 = obj2.div(48,4);
        double r11 = obj2.power(4, 3);

        System.out.println(r7 + "  " + r8 + "  " + r9 + "  " + r10 + "  " + r11);


    }
}

// in Java you can do single level and multile inheritence but we cannot do the multiple inheritence
// we get Ambiguity problem in multiple inheritence means when the same methods present in both parent class
// which method should it choose which parent class ? so the multiple inheritence does not work in java. 
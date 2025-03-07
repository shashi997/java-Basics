// functional interface annotation means the inteface should have only one method when we try to create more methods it 
// will give an error. 

@FunctionalInterface        // single abstract method (SAM)
interface A
{
    int add(int i,int j);
}

// we can create the interface methods by creating other class and extending and creating a same method (or)
// we can use anonymous class for creating the method.
// when using the functional interface or one method in interface we can use the lambda expression to write the method in small code.

public class functionalInterface_lambda {
    public static void main(String[] args) {
        
        // A obj = new A()
        // {
        //     public int add(int i,int j)          // anonymous class
        //     {
        //         return i+j;
        //     }
        // };

// lambda expression only works with functional interface/ interface with single method.

        // A obj = (int i,int j) ->    // lambda expression
        // {
        //     return i+j;
        // };


        
        // when we have a single statment there is no need for curly braces and return type also no need to need to mention for 
        // single statement 

        // A obj = (int i,int j) -> i+j;      // lambda expression

        // we can also remove the int type because we are mentioning in the interface so no need for mentioning again.

        A obj = (i,j) -> i+j;       // lambda expression





        int result = obj.add(8,5);
        System.out.println(result);
    }
}

// we can also pass the lambda expression as the argument when we use collections framework.

/*  there are 3 types of interfaces 
 *  1) Normal interfaces :- which have more than 1 abstract methods.
 *  2) Functional interface (SAM) :- which interface have a single interface method then it is functional interface.
 *  3) Marker interface :- which have no methods/blank used in serialisation and advanced java. 
 */

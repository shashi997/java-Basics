
class A implements Runnable      // Implementing Runnable which is implented by Thread class.
{
 public void run()   // run() is a method of Runnable class
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hi");
           try {
            Thread.sleep(10);
         }
            catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
        }
    }
}



public class thread_2 {
    public static void main(String[] args) {

        // reference of Runnable and object of class
        Runnable obj1 = new A();
        // instead of creating the B class we can create an anonymous class also Runnable is an functional interface 
        // so we use lambda expression.
        Runnable obj2 = () -> 
        {
         for(int i=1;i<=5;i++)
         {
            System.out.println("hello");
           try {
            Thread.sleep(10);
            }
            catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
         }
        };

        // t1 & t2 have no idea of objects so we are passing objects of A&B.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // start method belongs to thread but we are implenting runnable which has only run method.
        t1.start();
        t2.start();

    }
}

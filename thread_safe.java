
class counter
{
    int count;
    // synchronized keyword means it call by only one object at a time.
    public synchronized void increment()
    {
        count++;
        
    }
}


public class thread_safe {
    public static void main(String[] args) throws InterruptedException
     {

        counter c = new counter();

        Runnable obj1 = () -> 
        {
         for(int i=1;i<=10000;i++)
         {
            c.increment();
         }
        };

        Runnable obj2 = () -> 
        {
         for(int i=1;i<=10000;i++)
         {
            c.increment();
         }
        };

        // creating new thrads
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Getting thread to Runnable State
        t1.start();
        t2.start();

        // After completion of both threads it will join main method and start executing main method.
        t1.join();
        t2.join();
        // join is an checked exception so we throwed an exception.

        System.out.println(c.count + " : hello");


    }
}


/*  Thread States are 1) New  2) Runnable  3) Running  4) Waiting  5) Dead  
 * These are 5 of states in general the thread goes through
 * when we create new thread it will be in New State.
 * When we start() thread then it is in Runnable state
 * When we run() thread then it is in Running State.
 * when we wait(), sleep() methods send thread to the waiting State.
 * when we use notify() then the thread goes from waiting Sate to Runnable state.
 * When we use stop() method then the thread goes through the Dead State.
 */

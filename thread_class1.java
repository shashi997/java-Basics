// when we use frameworks it creates Threads underneath them so when we working on big projects we may not see Thread implementation.
// But understanding of the threads implementation gives you more understading of how threads work.

class A extends Thread  // extedning thread class for using threads.
{
    public void run()   // for thread to do work we should have run() method
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("hi");
           //checked exception(Thread.sleep()) so we should try and catch block/ throw the exception to main.
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


class B extends Thread  // extedning thread class for using threads.
{
    public void run()   
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("hello");

            try {
            Thread.sleep(10);       // it means to sleep for 10 millisec after execution
        } 
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}

public class thread_class1 {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        // we are setting the maximum prority of 10 for obj2, we can also set 10 instead of Thread.MAX_PRIORITY
        // we are just suggesting the scheduler(contains some algorithms) that it has higher priority.
        obj2.setPriority(Thread.MAX_PRIORITY);

        // we use start methods for calling the methods of run. start and run are two methods we use in threads.
        obj1.start();
        // wait for 10msec for executing the program
        try {
            Thread.sleep(10);
        } 
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj2.start();

        // by deafult methods have a proprity of 5 which is normal/default.
        // 1 is of lower priority and 10 beign the higher prority.
        System.out.println(obj1.getPriority());     // 5
        System.out.println(obj2.getPriority());     // 10

        
        
    }
}

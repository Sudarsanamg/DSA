public class Threading implements Runnable {
    
    public void run()
    {
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println("Run method");
        }
    }

    public static void main(String[] args) {
        Threading tc=new Threading();
       Thread t=new Thread(tc);
       t.setPriority(6);
       t.start();
      
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main method");
        }
        System.out.println(Thread.currentThread().getPriority());
    }

} 
//here the output will not be same it will differed inn systems

/*
 * In java every thread will have some name it might be explicitely given by the programmer ot default name given 
 * by the jvm we can get and set name of the thread  by using following classes methods of thread class
 * if i want to get the namr of the thread get by getname() method and set the name by setname() method
 */

 /*
  * Priority of threads 

  the default priority for hte main method is only 5 for every thread in java has some priority
  that might br given by programmer or jvm by default the valid rangr of the thrad priority is srom 1 to 10
  but not 0 to 10


  thread scheduler will use thread priorities while allocating the processor the thread which is having highest priority 
  will get the chance first .Thread class defines following methods to get and set in priority

  public final getPriority();
  public final setPriority();


  the methods to prevent the thread execution
  1.yield()
  2.join()
  3.sleep()

  yield 

  current thread execution give them a chance to remaining threads which are in waiting
  with the same priority

  if ther is no thread waiting with the same priority or the least priority same thread will continue its execution

  if there is no waiting thread or all waiting threads having the least priority then same thread execution will happen 

  if several waiting threads are having the same priority which thread will get the chance we dont know
  
  join function merges the thread and linearly executed the thread
  

  */

package ThreadsTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Printer extends Thread
{
    @Override
    public void run() {
        System.out.println(currentThread().getName()+" is printing");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {

         int poolSize=3;
         Printer printer=new Printer();

        ExecutorService pool= Executors.newFixedThreadPool(poolSize);
        int i;
        for (i=0; i<10; i++)
         {
             pool.execute(printer);
         }

        pool.shutdown();
    }
}

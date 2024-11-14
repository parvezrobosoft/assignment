package ThreadsTask;

import java.util.concurrent.CountDownLatch;

class Work extends Thread
{
    static int number=1;
    int workerNumber;
    final CountDownLatch latch;

    Work(CountDownLatch latch)
    {
        this.latch=latch;
        this.workerNumber= number;
        number++;
    }

    @Override
    public void run() {
        System.out.println("Worker "+workerNumber+" working");
        try {
            latch.countDown();
            sleep(1000);
            System.out.println("Worker "+workerNumber+"finished");
        } catch (InterruptedException e) {
            System.out.println("Worker interrupted");
        }

    }
}

public class WorkerCountDown {


    public static void main(String[] args) throws InterruptedException {
        int workerCount=5;

        CountDownLatch latch=new CountDownLatch(workerCount);

        for(int i=0;i<workerCount;i++)
        {
            new Work(latch).start();
            Thread.sleep(100);
        }
        latch.await();
    }


}

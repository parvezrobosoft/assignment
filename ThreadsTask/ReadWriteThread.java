package ThreadsTask;

class ReadWriteLock
{

    int readers;
    int writers;
    int writeRequests;

    public synchronized void readLock() throws InterruptedException {

        while (readers>0||writeRequests>0)
        {
            wait();
        }
        readers++;

    }
    public synchronized void readUnlock()
    {
        readers--;
        notifyAll();

    }
    public synchronized void writeLock() throws InterruptedException {
        writeRequests++;
        while (readers>0||writers>0)
        {
            wait();
        }
        writeRequests--;
        writers++;

    }

    public synchronized void writeUnlock()
    {
        writers--;
        notifyAll();

    }
}




public class ReadWriteThread {

    public static void main(String[] args) {


        ReadWriteLock lock=new ReadWriteLock();

        Thread reader1=new Thread(new Reader(lock,1));
        Thread reader2=new Thread(new Reader(lock,2));
        Thread reader3=new Thread(new Reader(lock,3));

        Thread writer1=new Thread(new Writer(lock,1));


        reader1.start();
        reader2.start();
        reader3.start();
        writer1.start();


    }

}

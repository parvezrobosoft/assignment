package ThreadsTask;

public class Reader implements Runnable {
     ReadWriteLock lock;
     int id;

    public Reader(ReadWriteLock lock, int id) {
        this.lock = lock;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            lock.readLock();
            System.out.println("Reader " + id + " reading");
            Thread.sleep(1000);
            System.out.println("Reader " + id + " finished");
            lock.readUnlock();
        } catch (InterruptedException e) {
            System.out.println("reader interrupted");
        }
    }
}


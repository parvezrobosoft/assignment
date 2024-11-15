package ThreadsTask;

public class Writer implements Runnable
{


      final ReadWriteLock lock;
        private final int id;

        public Writer(ReadWriteLock lock, int id) {
            this.lock = lock;
            this.id = id;
        }

        @Override
        public void run() {
            try {
                lock.writeLock();
                System.out.println("Writer " + id + " writing");
                Thread.sleep(1000);
                System.out.println("Writer " + id + " releasing ");
                lock.writeUnlock();
            } catch (InterruptedException e) {
                System.out.println("Writer interrupted");
            }
        }
    }


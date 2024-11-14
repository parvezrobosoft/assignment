package ThreadsTask;
class Sleep implements Runnable {

    @Override
    public void run() {
        System.out.println("Sleeping");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }

    }
}
public class SleepInterrupt {
    public static void main(String[] args) {
        Thread sleep=new Thread(new Sleep());
        sleep.start();
        sleep.interrupt();
    }
}

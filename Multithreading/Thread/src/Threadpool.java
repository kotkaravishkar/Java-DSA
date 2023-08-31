
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Threadpool {
    public static void main(String[] args) {
        ExecutorService ser = Executors.newFixedThreadPool(5);
        ExecutorService ser1 = Executors.newCachedThreadPool();

        for (int i = 1; i < 10; i++) {
            Mythread obj = new Mythread(i);
            ser1.execute(obj);
        }

        ser1.shutdown();
    }

    static class Mythread implements Runnable {
        int num;

        Mythread(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread() + "Start Thread" + num);
            dailyTask();
            System.out.println(Thread.currentThread() + "End Thread" + num);
        }

        void dailyTask() {

            try {
                Thread.sleep(80000);
            } catch (InterruptedException ie) {

            }
        }
    }
}
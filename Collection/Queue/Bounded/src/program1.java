import java.util.concurrent.BlockingDeque;
import java.util.concurrent.*;
import java.util.*;


public class program1 {
    public static void main(String[] args) throws InterruptedException {


        BlockingQueue bq = new ArrayBlockingQueue(3);

        bq.offer(10);
        bq.offer(20);
        bq.offer(30);

        System.out.println(bq);
        bq.offer(40,5,TimeUnit.SECONDS);

        System.out.println(bq);

        ArrayList al = new ArrayList();

        bq.drainTo(al);


        System.out.println(al);
        System.out.println(bq);

    }
}

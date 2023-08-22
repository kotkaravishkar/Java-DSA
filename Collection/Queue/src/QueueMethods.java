import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args) {

        Queue q = new LinkedList();


        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        q.poll();

        System.out.println(q);

        q.remove();

        System.out.println(q);

        System.out.println(q.peek());

    }
}

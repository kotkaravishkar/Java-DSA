import java.util.ArrayDeque;
import java.util.Deque;

public class program1 {
    public static void main(String[] args) {

        Deque dq = new ArrayDeque();

        dq.offer(10);
        dq.offer(30);
        dq.offer(40);
        dq.offer(150);
        dq.offer(70);
        dq.offer(50);

        System.out.println(dq);

        dq.offerFirst(2);
        dq.offerLast(5);

        System.out.println(dq);

        dq.pollFirst();
        dq.pollLast();

        System.out.println(dq);

    }
}

import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(20);
        pq.offer(10);
        pq.offer(80);
        pq.offer(30);
        pq.offer(10);

        System.out.println(pq);
    }
}

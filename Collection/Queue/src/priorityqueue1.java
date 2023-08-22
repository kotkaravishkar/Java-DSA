import java.util.PriorityQueue;

public class priorityqueue1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer("ABC");
        pq.offer("EFG");
        pq.offer("PQR");
        pq.offer("XYZ");
        pq.offer("ABC");

        System.out.println(pq);
    }
}

import java.util.*;

public class Priorityqueue {

    public static void main(String[] args) {

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(40);
        pq.add(10);
        pq.add(100);

        System.out.println(pq.peek());
    }
}
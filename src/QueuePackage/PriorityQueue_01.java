package QueuePackage;

import java.util.PriorityQueue;

public class PriorityQueue_01 {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("manoj");
        pq.add("amol");
        pq.add("ram");
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

        System.out.println("Removed: " + q.remove());
        System.out.println("Front element: " + q.peek());
        System.out.println("Queue after operations: " + q);
    }
}

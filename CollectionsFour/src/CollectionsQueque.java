import java.util.PriorityQueue;

public class CollectionsQueque {
    public static void main(String[] args) {
        PriorityQueue<Integer> que = new PriorityQueue<>();

        que.add(1);
        que.add(2);
        que.add(3);

        System.out.println(que.peek());
        System.out.println(que.peek());
    }
}

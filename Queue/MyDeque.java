package DSA2.Queue;
import java.util.*;
public class MyDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addLast(20);
        dq.getFirst();
        dq.getLast();
        dq.removeFirst();
        dq.removeLast();
        while(!dq.isEmpty()){
            System.out.println(dq.removeFirst());
        }

    }
}

package Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicsSTLQueues {
    public static void main(String[] args) {
//        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q+" " +q.peek());
        q.remove();
        System.out.println(q+" "+q.size());
        System.out.println(q.remove()+" "+q);
    }
}

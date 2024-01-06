package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class basicqueues {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(2);
        System.out.println(q.isEmpty());
        q.add(3);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(9);
        //q.size();
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();//remove are both same
        System.out.println(q);
        System.out.println(q.peek());//elements are both are same
        System.out.println(q.size());

    }
}

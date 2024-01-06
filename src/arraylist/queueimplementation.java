package arraylist;

import java.util.LinkedList;
import java.util.*;

public class queueimplementation {
    static void Dequeexaples(){
        Deque<Integer> d=new LinkedList<>();
        d.add(23);
        d.add(12);
        d.add(34);
        d.add(67);
        d.add(78);
        d.add(90);
        d.addFirst(2);
        d.addFirst(3);
        d.addLast(5);
        d.addLast(7);
        //d.addAll(8,10)
        System.out.println(d);
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
        System.out.println(d);
    }
    static void Priorityqueue1(){
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        q.add(34);
        q.add(89);
        q.add(45);
        q.add(100);
        q.add(300);
        q.add(1000);
        System.out.println(q);
    }
    static void priorityqueueexample(){
        PriorityQueue<Integer> pq=new PriorityQueue();
        pq.add(23);
        pq.add(21);
        pq.add(20);
        pq.add(89);
        pq.add(90);
       // pq.add(50);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

    }
    static  void queueexampl(){
        Queue<Integer> q=new LinkedList<>();
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);

    }
    public static void main(String[] args) {
//        queueexampl();
//        priorityqueueexample();
       // Priorityqueue1();
        Dequeexaples();

    }
}

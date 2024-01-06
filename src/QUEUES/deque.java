package QUEUES;
import java.util.Deque;
import java .util.LinkedList;

public class deque {
    public static void main(String[] args) {
       Deque <Integer> d=new LinkedList<>();
       d.add(3);
       d.add(1);
       d.add(4);
       d.add(2);
       d.add(6);
       d.add(9);
        System.out.println(d);
        d.add(45);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        d.addLast(100);
        System.out.println(d);
        d.addFirst(104);
        System.out.println(d);
       // d.removeAll(d);
        System.out.println(d);


    }
}

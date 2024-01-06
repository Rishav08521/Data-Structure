package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class basicquestion {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        System.out.println(q);
        Queue<Integer> d=new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
           // int x=q.poll();
            d.add(q.poll());
        }
        while (d.size()>0){
            q.add(d.poll());
        }
    }
}

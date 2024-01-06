package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class quest {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        // rear 6 5 4 3 2 1 //front
        Queue<Integer> u=new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            int y=q.poll();
            u.add(y);
        }
        while (u.size()>0){
            q.add(u.poll());
        }
        //System.out.println(q);


    }
}

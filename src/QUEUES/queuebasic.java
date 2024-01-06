package QUEUES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queuebasic {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.size());
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}

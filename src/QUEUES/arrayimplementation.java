package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class arrayimplementation {
    public static class queuearray{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return ;
            }
            if(f==-1) f=r=0;
            else{
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isempty(){
            if (size==0) return false;
            else
                return true;

        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
            }else{
                for(int i=f;i<r;i++){
                    System.out.println(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        //Queue<Integer> q=new LinkedList<>();
        queuearray q=new queuearray();
        q.display();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.display();
        //System.out.println(q);
    }
}

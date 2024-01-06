package QUEUES;

import java.util.LinkedList;

public class circularqueue {
    public static class circular{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr=new int[5];
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("circular queue is full");
            }else if (size==0){
                    front =rear=0;
                    arr[0]=val;
                } else if(rear<arr.length-1){
                arr[++rear]= val;
            }else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;

            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
            } else{
                int val=arr[front];
                if(front==arr.length-1) return front;
                else  front ++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
            }else
                return arr[front];
            }
            public boolean isEmpty(){
                if(size==0) return true;
                else return false;
            }
            public void display(){
            if(size==0){
                System.out.println("queue is empty");
                return;
            } else if (front <=rear) {
                for(int i=front;i<=rear;i++){
                    System.out.println(arr[i]+" ");
                }
                
            }else{
                for(int i=0;i<rear;i++){
                    System.out.println(arr[i]+" ");
                }
            }
                System.out.println();

            }
    }
    public static void main(String[] args) throws Exception {
        circular q=new circular();
        q.display();
        q.add(2);
        q.add(9);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        q.add(6);
        q.display();
        q.add(7);
        q.display();
       // q.add(8);
       // q.display();
        for(int i=0;i<q.arr.length;i++){
            System.out.print(q.arr[i]+" ");
        }
        



    }
}

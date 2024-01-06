package linkedlist;
import java.util.*;

public class singlelinklist {
    public static class Node{
        int data;
        Node next;
        int size=0;

        public Node(int data) {
            this.data=data;

        }

    }
    public static class Linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void displayUsingHead(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public void displayReverseUsingHead(Node head){
            if(head.next==null) {
                System.out.print(head.data+" ");
                return;
            }
            displayReverseUsingHead(head.next);
            System.out.print(head.data+" ");
            return;
        }

        public void addAtHead(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        public void addAttail(int data) {
            Node temp = new Node(data);
            if (head == null) {
                addAtHead(data);
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void add(int idx, int data){
            if(idx<0 || idx>size){
                System.out.println("Wrong Index");
                return;
            }
            else if(idx==0){
                addAtHead(data);
                return;
            }else if(idx==size){
                addAttail(data);
                return;
            }
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp=temp.next;
            }
            Node x = new Node(data);
            x.next=temp.next;
            temp.next=x;

            size++;
        }

        public int getAt(int idx){
            Node temp=head;
            if(idx<0 || idx>size-1){
                System.out.println("Wrong Index");
                return -1;
            }
            for(int i=1; i<=idx; i++){
                temp=temp.next;
            }
            return temp.data;
        }

        public void deleteAt(int idx){
            Node temp = head;
            if(idx<0 || idx>size-1){
                System.out.println("Wrong Index");
            }else if(idx==0){
                head=head.next;
            }else{
                for(int i=1; i<=idx-1; i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
            size--;
        }

        public int sizeUsingHead(Node head){
            Node temp = head;
            int size=0;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            return size;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;

        Node t = a;

        while(t!=null){
            arr.add(t.data);
            t=t.next;
        }

        System.out.println(arr);
    }
  }


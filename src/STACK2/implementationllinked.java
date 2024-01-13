package STACK2;

import stack.llstackimplementation;

import java.util.Stack;

public class implementationllinked {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linked{
        node head=null;
        int size=0;
        void push(int x){
            node temp=new node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if (head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x=head.data;
            head= head.next;
            return x;
        }
        int peek() {
            System.out.println("stack is empty");
            return -1;
        }

        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        linked ll = new linked();
        ll.push(3);
        ll.push(7);
        ll.push(4);
        ll.display();
        ll.peek();
        ll.pop();

    }
}

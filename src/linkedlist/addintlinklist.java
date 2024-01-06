package linkedlist;
import java.util.*;
import java.util.LinkedList;

public class addintlinklist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void add(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void addInteger(int integer) {
            int carry = integer;
            Node curr = head;

            while (carry > 0) {
                int sum = curr.data + carry;
                carry = sum / 10;
                curr.data = sum % 10;
                curr = curr.next;
            }

            if (carry > 0) {
                Node newNode = new Node(carry);
                newNode.next = head;
                head = newNode;
            }
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.add(1);
            list.add(2);
            list.add(3);

            System.out.println("Original linked list:");
            list.printList();

            list.addInteger(4);

            System.out.println("Linked list after adding 4:");
            list.printList();
        }
    }

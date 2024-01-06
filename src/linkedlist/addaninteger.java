package linkedlist;

public class addaninteger {
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

        public void insert(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

         public static void main(String[] args) {
            LinkedList linkedList = new LinkedList();

            linkedList.insert(10);
            linkedList.insert(20);
            linkedList.insert(30);

            linkedList.printList();
        }
    }

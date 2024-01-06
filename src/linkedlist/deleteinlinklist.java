package linkedlist;

public class deleteinlinklist {
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

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void deleteNode(int key) {
            if (head == null) {
                return;
            }

            // If the node to be deleted is the head node
            if (head.data == key) {
                head = head.next;
                return;
            }

            // Find the previous node of the node to be deleted
            Node prev = head;
            Node curr = head.next;
            while (curr != null && curr.data != key) {
                prev = curr;
                curr = curr.next;
            }

            // If the node to be deleted was not found
            if (curr == null) {
                return;
            }

            // Delete the node
            prev.next = curr.next;
        }

        public void printList() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(20);
        list.push(4);
        list.push(15);
        list.push(85);

        System.out.println("Created Linked List: ");
        list.printList();

        list.deleteNode(15);

        System.out.println("\nLinked List after Deletion of 15: ");
        list.printList();
    }
}

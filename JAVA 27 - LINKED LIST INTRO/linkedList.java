//  LINKED LIST IN JAVA

import java.util.LinkedList;

public class linkedList {
    Node head;

    private int size;

    linkedList() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // ADD = AddFirst
    public void AddFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println(" List is Empty ");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    // Delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("This is Empty ");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("This is Empty ");
            return;

        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next; // head.next == null +> last Node == null
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    // REVERSE LINKEDLIST
    // 1 RECURESSION :
    public Node revRecc(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = revRecc(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // 2 .
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = prevNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addLast("is");
        list.addLast("a");

        list.printList();

        list.addLast("list");
        list.printList();

        list.AddFirst("This");
        list.printList();

        // delete
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();

        // Size Null is not Counteed
        System.out.println(list.getSize());

        // REVERSE LIST :

        // list.reversed(); // [..5,4,3,2,1]
        // list.printList();//[1,2,3,4,5]

    }
}

// package JAVA 30 - STACK DS;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class stack {
        public static Node head;

        public boolean isEmp() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmp()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmp()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peak() {
            if (isEmp()) {
                return -1;
            }

            return head.data;

        }
    }

    public static void main(String[] args) {
        System.out.println("Stack In DS LIFO ");

        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // OUTPUT [4,3,2,1]
  
        while (!s.isEmp()) {
            System.out.println(s.peak());
            s.pop();
        }

    }
}

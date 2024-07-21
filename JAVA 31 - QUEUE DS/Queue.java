//  package JAVA 26 - QUEUE DS;

//  Implementation 1 . 
//  QUEUE Using Array

// public class Queue {

//     static class Queuey {
//         static int arr[];
//         static int size;
//         static int rear = -1;

//         @SuppressWarnings("static-access")
//         Queuey(int size) {
//             arr = new int[size];
//             this.size = size;
//         }

//         public static boolean isEmpty() {
//             return rear == -1;
//         }

//         // Add && ENQUEUE
//         public static void add(int data) {
//             if (rear == size - 1) {
//                 System.out.println("Full Queue");
//                 return;
//             }
//             rear++;
//             arr[rear] = data;

//         }

//         // Remove && DEQUEUE
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }

//             int front = arr[0];
//             for (int i = 0; i < rear; i++) {
//                 arr[i] = arr[i + 1];
//             }

//             rear--;
//             return front;
//         }

//         // PEEK
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }

//             return arr[0];
//         }

//     }

//     @SuppressWarnings("static-access")
//     public static void main(String[] args) {
//         Queuey q = new Queuey(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         // 1 2 3

//         while (!q.isEmpty()) {
//             System.out.print("Queue ");
//             System.out.println(q.peek());
//             q.remove();

//         }
//     }
// }

//  Implementatin 2 
//  Circular Queue using Array

// public class Queue {

//     static class Queuey {
//         static int arr[];
//         static int size;
//         static int rear = -1;
//         static int front = -1;

//         @SuppressWarnings("static-access")
//         Queuey(int size) {
//             arr = new int[size];
//             this.size = size;
//         }

//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         public static boolean isfull() {
//             return (rear + 1) % size == front;
//         }

//         // Add && ENQUEUE
//         public static void add(int data) {
//             if (isfull()) {
//                 System.out.println("Full Queue");
//                 return;
//             }

//             // 1st Element add
//             if (front == -1) {
//                 front = 0;
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;

//         }

//         // Remove && DEQUEUE O(1)
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }

//             int result = arr[front];
//             if (rear == front) {
//                 rear = front = -1;
//             } else {
//                 front = (front + 1) % size;
//             }

//             return result;
//         }

//         // PEEK
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }

//             return arr[front];
//         }

//     }

//     @SuppressWarnings("static-access")
//     public static void main(String[] args) {
//         Queuey q = new Queuey(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         System.out.println(q.remove());
//         q.add(6);
//         System.out.println(q.remove());
//         q.add(7);

//         // 1 2 3 4 5 6 7

//         while (!q.isEmpty()) {

//             System.out.println(q.peek());
//             q.remove();

//         }
//     }
// }

// Implementation 3 
// Queue using Linked List

public class Queue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queuey {
        static Node head = null;
        static Node tall = null;

        public static boolean isEmpty() {
            return head == null & tall == null;
        }

        // Add && ENQUEUE
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tall == null) {
                tall = head = newNode;
                return;
            }
            tall.next = newNode;
            tall = newNode;

        }

        // Remove && DEQUEUE O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data;
            if (head == tall) {
                tall = null;
            }
            head = head.next;

            return front;

        }

        // PEEK
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.data;
        }

    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queuey q = new Queuey();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // 1 2 3 4 5

        while (!q.isEmpty()) {

            System.out.println(q.peek());
            q.remove();

        }
    }
}
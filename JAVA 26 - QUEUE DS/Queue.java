// package JAVA 26 - QUEUE DS;

// 1 . 
// QUEUE Using Array
public class Queue {

    static class Queuey {
        static int arr[];
        static int size;
        static int rear = -1;

        @SuppressWarnings("static-access")
        Queuey(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // Add && ENQUEUE
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;

        }

        // Remove && DEQUEUE
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }

        // PEEK
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }

    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queuey q = new Queuey(5);
        q.add(1);
        q.add(2);
        q.add(3);

        // 1 2 3

        while (!q.isEmpty()) {
            System.out.println("Queue ");
            System.out.println(q.peek());
            q.remove();

        }
    }
}

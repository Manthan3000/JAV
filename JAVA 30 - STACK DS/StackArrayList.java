
// package JAVA 30 - STACK DS;
import java.util.*;

public class StackArrayList {
    static class stack {
        // List Create
        static ArrayList<Integer> list = new ArrayList<>();

        // Empty
        public boolean isEmp() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmp()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public int peak() {
            if (isEmp()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Stack In DS LIFO ");

        // stack q = new stack();
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

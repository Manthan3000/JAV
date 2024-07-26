// package JAVA 30 - STACK DS;

import java.util.*;

public class StackPracQ {

    // Push at the Bottom of Stack
    public static void pushBtm(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBtm(data, s);
        s.push(top);
    }

    // Reverse a Stack
    public static void Reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        Reverse(s);
        pushBtm(top, s);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // Original STACK [4,3,2,1]

        // Push at the Bottom of Stack
        pushBtm(5, s); // Push 5 at Bottom [4,3,2,1,5]

        // Reverse a Stack
        // Reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

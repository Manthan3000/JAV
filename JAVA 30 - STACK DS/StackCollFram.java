
// package JAVA 30 - STACK DS;
//Collection Framework

import java.util.Stack;

public class StackCollFram {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // OUTPUT [4,3,2,1]

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

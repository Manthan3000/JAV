import java.util.*;

// // Q 1 find avg of 3 numbers

public class Questions {

    public static int findAvg(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number A :");
        int a = input.nextInt();
        System.out.print("Enter Number B :");
        int b = input.nextInt();
        System.out.print("Enter Number C :");
        int c = input.nextInt();

        int avg = findAvg(a, b, c);
        System.out.println(avg);

    }
}

// // Q 2 find sum of all odd number from 1 to N

// public class Questions {

// public static void printsum(int n) {
// int sum = 0;
// for (int i = 1; i < n; i++) {
// if (i % 2 != 0) {
// sum += i;
// }
// }
// System.out.println(sum);
// }

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter Number N : ");
// int n = input.nextInt();
// printsum(n);
// }
// }

// // Q 3 find greatest of 2 Numbers

// public class Questions {

// public static int findbig(int a, int b) {
// if (a > b) {
// System.out.println(a + " is greater then " + b);
// return a;
// } else {
// System.out.println(b + " is greater then " + a);
// return b;
// }
// }

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter Number A :");
// int a = input.nextInt();
// System.out.print("Enter Number B :");
// int b = input.nextInt();

// System.out.println(findbig(a, b));
// }
// }

// Q 4 find circumference of circle take R input

// public class Questions {
// public static double circum(double r) {
// return r * 2 * 3.17;
// }

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter Radius of circle :");
// int r = input.nextInt();

// System.out.println(circum(r));

// }
// }

// Q 5 find adult of child

// public class Questions {

// public static boolean vote(int age) {
// if (age > 18) {
// System.out.print(" You are adult : ");
// return true;
// } else {
// System.out.print (" You are adult : ");
// return false;
// }
// }

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter your age :");
// int age = input.nextInt();
// System.out.println(vote(age));
// }
// }

// Q 6 find Fibomacci series till n terms ....

// public class Questions {
// public static void number(int n) {
// return;
// }

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter The number N :");
// int n = input.nextInt();
// int a = 0, b = 1;
// System.out.println("Fibonacci Series till " + n + " term");
// // System.out.print(a + " ");
// for (int i = 1; i <= n; i++) {
// System.out.print(a + " ");
// int c = a + b;
// a = b;
// b = c;
// }
// System.out.println();
// }
// }

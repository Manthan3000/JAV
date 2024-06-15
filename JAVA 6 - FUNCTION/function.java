// import java.util.*;

// // Q 1 PRINT NAME OF THE PERSON ...

// public class function {

// public static void printMyName(String name) {
// System.out.println(name);
// }

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter Name :");
// String name = input.nextLine();

// printMyName(name);
// }
// }

// // Q 2 Find Sum Of Two Numbers ...
// public class function {
// public static int Addition(int a, int b) {
// int Sum = a + b;
// return Sum;
// }

// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Number 1 :");
// int a = sc.nextInt();
// System.out.print("Enter Number 2 :");
// int b = sc.nextInt();

// int Sum = Addition(a, b);
// System.out.println("Addition of two numbars are : " + Sum);

// }
// }

// // Q 3 . Find Product Of Two Numbers ...

// public class function {
// public static int Product(int a, int b) {
// int multiply = a * b;
// return multiply;
// }

// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Number 1:");
// int a = sc.nextInt();
// System.out.print("Enter Number 2:");
// int b = sc.nextInt();

// int Mul = Product(a, b);
// System.out.println("Product of two numbers are :" + Mul);

// }
// }

// // Q 4 Find factorial of numbers

import java.util.Scanner;

public class function {

    public static void printFact(int a) {
        if (a < 0) {
            System.out.println("Invalid Number :");
            return;
        }
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int a = sc.nextInt();

        printFact(a);
    }
}

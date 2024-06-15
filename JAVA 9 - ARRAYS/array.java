import java.util.*;

// public class array {
// public static void main(String[] args) {

// //METHODE 1
// // int[] marks = new int[3]; //Define Array
// // marks[0] = 97; // phy
// // marks[1] = 99; // chem //Storing Value 1
// // marks[2] = 99; // eng

// // // System.out.println(marks[0]);
// // // System.out.println(marks[1]); // For Accessing array 1
// // // System.out.println(marks[2]);

// //METHODE
// int[] marks = { 97, 99, 99 };

// for (int i = 0; i < 3; i++) {
// System.out.println(marks[i]);
// }
// }
// }

//input by user and add in array And Search index
// LINEAR SEARCH ( D.S.A)

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of array : ");
        int size = sc.nextInt();
        System.out.println("Enter Values in Array : ");
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter Search Values in Array : ");
        int x = sc.nextInt();

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == x) {
                System.out.println(x + " found at index " + index);
            }

        }
    }
}
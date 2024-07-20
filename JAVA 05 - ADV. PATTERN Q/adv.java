// Q 10 : Butterfly pattern

public class adv {
    public static void main(String[] args) {

        int n = 5;
        // Upper Half
        for (int i = 1; i <= n; i++) {
            // 1st part star == 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 2nd part Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {
            // 3rd part star == 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 4th part Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// // Q 11 SOLID RHOMBUS

// public class adv {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// // SPACE
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// // STARS
// for (int index = 1; index <= 5; index++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }

// }
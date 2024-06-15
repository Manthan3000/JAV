import java.util.*;

// public class arrays2D {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Numbers of Rows :");
//         int rows = sc.nextInt();
//         System.out.print("Enter Numbers of Columns :");
//         int columns = sc.nextInt();

//         int[][] Numbers = new int[rows][columns];

//         // rows
//         for (int i = 0; i < rows; i++) {
//             // Columns
//             for (int j = 0; j < columns; j++) {
//                 Numbers[i][j] = sc.nextInt();

//             }
//         }

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 System.out.print(Numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// // Q take a matrix as input from the user Search for a given number X and print index

public class arrays2D {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers of Rows :");
        int rows = sc.nextInt();
        System.out.print("Enter Numbers of Columns :");
        int columns = sc.nextInt();

        int[][] Numbers = new int[rows][columns];

        // rows
        for (int i = 0; i < rows; i++) {
            // Columns
            for (int j = 0; j < columns; j++) {
                Numbers[i][j] = sc.nextInt();

            }
        }
        System.out.print("Enter Value Of X = ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (Numbers[i][j] == x) {
                    System.out.println(x + " Found at locaton " + "(" + i + " , " + j + ")");
                }
            }
        }
    }
}
// // PRInt All Permutation of a STRING :

// public class recursion3 {

//     public static void printperm(String str, String Permutation) {
//         if (str.length() == 0) {
//             System.out.println(Permutation);
//             return;
//         }

//         for (int i = 0; i < str.length(); i++) {
//             char currchar = str.charAt(i);

//             String newstr = str.substring(0, i) + str.substring(i + 1);
//             printperm(newstr, Permutation + currchar);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "ABC";
//         printperm(str, "");
//     }
// }

// // Count Total Path in a maze to move from (0 , 0) to (n , m)

// public class recursion3 {

//     public static int countPaths(int i, int j, int n, int m) {
//         if (i == n || j == m) {
//             return 0;
//         }
//         if (i == n - 1 && j == m - 1) {
//             return 1;
//         }
//         // move Downwards
//         int downPath = countPaths(i + 1, j, n, m);

//         // move Right
//         int rightPath = countPaths(i, j + 1, n, m);

//         // Totle Paths
//         return downPath + rightPath;
//     }

//     public static void main(String[] args) {
//         int n = 3, m = 3;
//         int totalPaths = countPaths(0, 0, n, m);

//         System.out.println(totalPaths);
//     }
// }

// Place Tiles of size 1 * m in a floor if size n * m

public class recursion3 {

    public sta
    public static void main(String[] args) {
 
    }
}
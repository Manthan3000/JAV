// // PRInt All Permutation of a STRING : "ABC"

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

// public class recursion3 {

//     public static int placeTiles(int n, int m) {
//         // BASE CASE
//         if (n == m) {
//             return 2;
//         }
//         if (n < m) {
//             return 1;
//         }

//         // VERTICALLY
//         int vertPlacement = placeTiles(n - m, m);

//         // HORIZONTAL
//         int horiPlacement = placeTiles(n - 1, m);

//         return vertPlacement + horiPlacement;
//     }

//     public static void main(String[] args) {
//         int n = 4, m = 2;

//         System.out.println(placeTiles(n, m));

//     }
// }

// Find the Number of Ways in which you can invite n people toyour party
//single pr in pairs

// public class recursion3 {
//     public static int callGuest(int n) {
//         if (n <= 1) {
//             return 1;
//         }

//         // Single
//         int ways1 = callGuest(n - 1);

//         // Pairs
//         int ways2 = (n - 1) * callGuest(n - 2);

//         return ways1 + ways2;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println(callGuest(n));
//     }
// }

// Print All the Subset of a set of n Natural Numbers 
// N = 3 = (1,2,3)

import java.util.ArrayList;

public class recursion3 {
    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = -0; i < subset.size(); i++) {
            System.out.println(subset.get(i) + "");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubset(subset);
            return;
        }
        // add hoga

        subset.add(n);
        findSubset(n - 1, subset);

        // add nahiihoga
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
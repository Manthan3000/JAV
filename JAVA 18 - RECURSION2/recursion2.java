//           TOWER OF HANOI

// public class recursion2 {

//     public static void towerOfHanoi(int n, String src, String helper, String dest) {

//         if (n == 1) {
//             System.out.println("transfer disk " + n + " from " + src + " to " + dest);
//             return;
//         }

//         towerOfHanoi(n - 1, src, dest, helper);
//         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
//         towerOfHanoi(n - 1, helper, src, dest);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         towerOfHanoi(n, " S ", " H ", " D ");

//     }

// }

//           REVERSE STRING

// public class recursion2 {
//     public static void printrev(String str, int idx) {
//         if (idx == 0) {
//             System.out.println(str.charAt(idx));
//             return;
//         }

//         System.out.print(str.charAt(idx));
//         printrev(str, idx - 1);
//     }

//     public static void main(String[] args) {
//         String str = "abcd";
//         printrev(str, str.length() - 1);
//     }
// }

// //       CHECK ARRAY IS SORTED

// public class recursion2 {

//     public static boolean issorted(int arr[], int idx) {

//         if (idx == arr.length - 1) {
//             return true;
//         }

//         if (arr[idx] < arr[idx + 1]) {
//             // ARRAY SORTRD TILL NOW
//             return issorted(arr, idx + 1);
//         } else {
//             return false;
//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = { 1, 2, 3 };// TRUE
//         // int arr[] = { 1, 4, 3 }; // FALSE

//         System.out.println(issorted(arr, 0));
//     }
// }

//  //      Print All Subsequences Of String


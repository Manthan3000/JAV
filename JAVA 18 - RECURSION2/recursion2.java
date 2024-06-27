//        //   TOWER OF HANOI

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

// //  //      Print All Subsequences Of String

// public class recursion2 {

//     public static void Subsequences(String str, int idx, String newString) {
//         if (idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         // to be
//         Subsequences(str, idx + 1, newString + currChar);
//         // not to bee
//         Subsequences(str, idx + 1, newString);

//     }

//     public static void main(String[] args) {
//         String str = "ABC";
//         Subsequences(str, 0, " "); // OUT== ABC,AB,BC,A,B,AC,C." "
//     }
// }

//  //      Print Unique Subsequences Of String

// import java.util.HashSet;

// public class recursion2 {

//     public static void Subsequences(String str, int idx, String newString, HashSet<String> set) {
//         if (idx == str.length()) {
//             if (set.contains(newString)) {
//                 return;
//             } else {
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }

//         char currChar = str.charAt(idx);
//         // to be
//         Subsequences(str, idx + 1, newString + currChar, set);
//         // not to bee
//         Subsequences(str, idx + 1, newString, set);

//     }

//     public static void main(String[] args) {
//         String str = "AAA"; // AAA , AA , A
//         HashSet<String> set = new HashSet<>();
//         Subsequences(str, 0, "", set);
//     }
// }

// Print Keypad Combination

public class recursion2 {

    public static String[] keyPad = { ".", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TU", "VWX", "YZ" };

    public static void printComb(String str, int idx, String combination) {

        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keyPad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "25"; // DM , DN ,DO ,EM ,EN ,EO ,FM ,FN ,FO
        printComb(str, 0, " ");
    }
}
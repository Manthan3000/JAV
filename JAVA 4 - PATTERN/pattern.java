// // PATTERNS IN JAVA

// //Q. 1 PRINT THIS PATTERN :

// * * * * *
// * * * * *
// * * * * *
// * * * * *

// public class pattern {
// public static void main(String[] args) {
// for (int i = 0; i < 4; i++) {
// for (int j = 0; j < 5; j++) {
// System.out.print("*");

// }
// System.out.println();
// }
// }

// }

// //Q 2
// * * * * *
// *-------*
// *-------*
// * * * * *

// public class pattern {
// public static void main(String[] args) {
// int n = 4;
// int m = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= m; j++) {
// if (i == 1 || j == 1 || i == n || j == m) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }

// }
// System.out.println();
// }
// }
// }

// // Q 3

// *
// * *
// * * *
// * * * *
// public class pattern {
// public static void main(String[] args) {
// for (int i = 0; i < 5; i++) {
// for (int j = 0; j < i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }

// }

// // // Q 4

// // * * * *
// // * * *
// // * *
// // *

// public class pattern {
// public static void main(String[] args) {
// for (int i = 4; i >= 1; i--) {
// for (int j = 0; j < i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }

// }

// // Q 5

// // *
// // * *
// // * * *
// // * * * *

// public class pattern {
// public static void main(String[] args) {

// for (int i = 1; i <= 5; i++) {
// // Space print
// for (int j = 1; j <= 5 - i; j++) {
// System.out.print(" ");
// }
// // Star Print
// for (int j = 1; j < i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// // Q 6

// // 1
// // 1 2
// // 1 2 3
// // 1 2 3 4

// public class pattern {
// public static void main(String[] args) {

// for (int i = 1; i <= 5; i++) {

// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }
// }

// // Q 7

// // 1 2 3 4 5
// // 1 2 3 4
// // 1 2 3
// // 1 2
// // 1

// public class pattern {
// public static void main(String[] args) {
// for (int i = 5; i >= 1; i--) {
// for (int j = 1; j < i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }

// }

// // // Q 8

// // 1
// // 2 3
// // 4 5 6
// // 7 8 9 10

// public class pattern {
// public static void main(String[] args) {
// int number = 1;
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(number + " ");
// number++;
// }
// System.out.println();
// }
// }

// }

// Q 9

// //1
// //0 1
// //1 0 1
// //0 1 0 1
// //1 0 1 0 1

// public class pattern {
// public static void main(String[] args) {
// for (int i = 1; i <= 5; i++) {
// for (int j = 1; j <= i; j++) {
// int sum = i + j;
// if (sum % 2 == 0) {
// System.out.print("1 ");
// } else {
// System.out.print("0 ");

// }
// }
// System.out.println();
// }
// }

// }
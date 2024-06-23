// Q 1 :     PRINT 5 TO 1 NUMBERS :

// public class recursion {

//     public static void printNum(int n) {
//         if (n == 0) {
//             return;      //BASE CASE 
//         }

//         System.out.println(n); // PRINT

//         printNum(n - 1); //RECURSION
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         printNum(n);
//     }
// }

// Q 2 :       PRINT 1 TO 5 NUMBERS

// public class recursion {

//     public static void printNum(int n) {
//         if (n == 6) {
//             return;
//         }
//         System.out.println(n);
//         printNum(n + 1);
//     }

//     public static void main(String[] args) {
//         int n = 1;
//         printNum(n);
//     }
// }

// Q 3 :    PRINT SUM OF THE FIRST N NATURAL NUMBAERS 

// public class recursion {
//     public static void printSum(int i, int n, int sum) {
//         if (i == n) {
//             sum += i;
//             System.out.println(sum);
//             return; // BASE CASE
//         }
//         sum += i;
//         printSum(i + 1, n, sum); // 15
//     }

//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// } 

// Q 4 :    PRINT FACTORIAL OF N NUMBERS

// public class recursion {

//     public static int calcFact(int n) {

//         if (n == 1 || n == 0) { 
//             return 1;
//         }

//         int fact_nm1 = calcFact(n - 1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         int ans = calcFact(n);
//         System.out.println(ans);
//     }
// }

// Q 5      FIBONACCI SERIES

public class recursion {

    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;

        printFib(a, b, n - 2);
    }

}

// Q 6 PRINT X ^ N (stack height = n)

// public class recursion {

// public static int calcPower(int x, int n) {
// if (n == 0) {
// return 1;
// }
// if (x == 0) {
// return 0;
// }

// int xpownum1 = calcPower(x, n - 1);
// int xpown = x * xpownum1;
// return xpown;
// }

// public static void main(String[] args) {
// int x = 2, n = 5;
// int ans = calcPower(x, n);
// System.out.println(ans);
// }

// }
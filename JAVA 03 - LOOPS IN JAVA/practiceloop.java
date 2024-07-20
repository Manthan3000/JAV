// // Q . print sum of First n natural numbres ...

// import java.util.*;

// public class practiceloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :");
//         int n = sc.nextInt();
//         int sum = 0;
//         for (int i = 0; i <= n; i++) {
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }

// } 

// // Print Multiplaction table of a Number input by User

import java.util.*;

public class practiceloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int sum = n * i;
            System.out.println(sum);
        }
        // System.out.println(sum);
    }

}

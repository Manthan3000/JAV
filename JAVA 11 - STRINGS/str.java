import java.util.*;

// public class str {

//     public static void main(String[] args) {
//         String name = "Manthan";
//         String fullName = "Manthan Ovhal";
//         Scanner sc = new Scanner(System.in);
//         String NAME = sc.nextLine();
//         System.out.println("Your name is " + NAME);
//     }
// }

// // FUNCTIONS IN STRING

// // 1 CONCATENATION :

// public class str {

//     public static void main(String[] args) {
//         String firstName = "Manthan";
//         String lastName = " Ovhal";
//         // Scanner sc = new Scanner(System.in);
//         // String NAME = sc.nextLine();
//         String fullName = firstName + lastName;  // +
//         System.out.println("Your name is " + fullName);
//     }
// }

// // 2 FIND LENGTH 

// public class str {

//     public static void main(String[] args) {
//         String name = "MANTHAN";
//         System.out.println(name.length()); //LENGTH 7
//     }
// }

// 3 TRAVICING STRING
public class str {
    public static void main(String[] args) {
        String name = "MANTHAN";
        for (int index = 0; index < name.length(); index++) {
            System.out.println(name.charAt(index));
        }
    }
}
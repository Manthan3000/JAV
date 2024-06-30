import java.util.*;

//      STRINGS ARE IMMUTEABLE

public class str {
    public static void main(String[] args) {
        String name = "Manthan";
        String fullName = "Manthan Ovhal";
        Scanner sc = new Scanner(System.in);
        String NAME = sc.nextLine();
        System.out.println("Your name is " + NAME);
    }
}

// // FUNCTIONS IN STRING

// // 1 CONCATENATION :

// public class str {

// public static void main(String[] args) {
// String firstName = "Manthan";
// String lastName = " Ovhal";
// // Scanner sc = new Scanner(System.in);
// // String NAME = sc.nextLine();
// String fullName = firstName + lastName; // +
// System.out.println("Your name is " + fullName);
// }
// }

// // 2 FIND LENGTH

// public class str {

// public static void main(String[] args) {
// String name = "MANTHAN";
// System.out.println(name.length()); // LENGTH 7
// }
// }

// // 3 TRAVICING STRING charAt

// public class str {
// public static void main(String[] args) {
// String name = "MANTHAN";
// for (int index = 0; index < name.length(); index++) {
// System.out.println(name.charAt(index));
// }
// }
// }

// // 4 compare two Strings

// public class str {

// public static void main(String[] args) {
// String str1 = "manthan";
// String str2 = "manthan";

// // 1 str1 > str2 = + value
// // 1 str1 = str2 = 0
// // 1 str1 < str2 = - value

// // if (str1.compareTo(str2) == 0) {
// // System.out.println("String are equal ");
// // } else {
// // System.out.println("not equal");
// // }

// // if (str1 == str2) {
// // System.out.println("String are equal ");
// // } else {
// // System.out.println("not equal");
// // }

// // if (new String("tony") == new String("tony")) {
// // System.out.println("equal");
// // } else {
// // System.out.println("not equal");
// // }
// }
// }

// // 5 Substrings

// public class str {

// public static void main(String[] args) {
// String sentence = "my name is manthan";
// String subString = sentence.substring(11, sentence.length());
// System.out.println(subString);
// }
// }

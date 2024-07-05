
// ABSTRACTION  = Abstract INFORMATION BY ABSTRACT KEYWORD

//rules 

//1.it always Start with ABSTRACT keyword,

//2.Can not be instansianted( OBJECTS) BASE CLASS >>> DERIVED CLASS

//BASE CLASS:
// abstract class animal {
//     public void walk() {

//     }
// }

// // DERIVED CLASS :
// class Horse extends animal {
//     public void walk() {
//         System.out.println("Walk on 4 legs");
//     }
// }

// class Chicken extends animal {
//     public void walk() {
//         System.out.println("Walk on 2 legs");
//     }
// }

// public class abstraction {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk(); // Walk on 4 legs

//     }
// }

//  PURE Abstraction :  INTERFACE

// interface animal {
//     int eyes = 2;

//     void walk();
// }

// interface Herbivore {

// }

// // Multiple inheratance is done by " interface "

// class Horse implements animal, Herbivore {
//     public void walk() {
//         System.out.println(" walk on 4 leg");
//     }
// }

// public class abstraction {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
//     }
// }

//  Static Will be " Common " for all Objects  

class Student {
    String name;
    static String school; // Static == School is same for all Student obj

    // Update value of School Name :
    public static void changeSchool() {
        school = "New School";
    }

}

public class abstraction {

    public static void main(String[] args) {

        Student.school = "MMCOE";
        Student s1 = new Student();
        s1.name = "Manthan";
        System.out.println(s1.school);
    }
}
//      CLASSES & Objects 

class Pen {
    String color;
    String type;
    int price;

    public void write() {
        System.out.println("Writing ....");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    String city;
    int marks;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.city);
        System.out.println(this.marks);

    }

    // // Non Parametrise Constructor
    // Student() {
    // System.out.println("Constructor called");
    // }

    // // Parametrise Constructor

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // // Copy Constructors

    Student(Student S2) {
        this.name = S2.name;
        this.age = S2.age;

    }

    Student() {

    }
}

public class oop {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Ballpen";
        pen1.price = 10;

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Gell";
        pen2.price = 20;

        pen2.write();// Writing,,,,

        pen1.printColor();// Blue
        pen2.printColor();// Black

        Student stu1 = new Student();

        stu1.name = "Manthan";
        stu1.age = 19;
        stu1.city = "Pune";
        stu1.marks = 83;

        stu1.printinfo();

        // parametrise Constructor
        // Student s1 = new Student("Manthan", 19);

        Student s1 = new Student();
        s1.name = "AMAN";
        s1.age = 24;

        Student S2 = new Student(s1);
        s1.printinfo();
    }

}

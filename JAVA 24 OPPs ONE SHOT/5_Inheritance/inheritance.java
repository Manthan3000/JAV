// INHERITANCE

// INSERESE REUSEABLITY OF THE CODE

// 1 . SINGLE LAVEL INHERITANCE

// //BASE CLASS = Shape

// class Shape {
//     public void area() {
//         System.out.println("Display area : ");

//     }
// }

// // DERIVED CLASS = Triangle

// class Triangle extends Shape {
//     public void area(int l, int h) {
//         System.out.println(1 / 2 * l * h);
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.area(); // Dispaly area : it will print

//     }
// }

// // 2 . MULTI LEVEL INHERATANCE

// // BASE CLASS = Shape
// class Shape {
// public void area() {
// System.out.println("Display area : ");

// }
// }

// // DERIVED CLASS = Triangle

// class Triangle extends Shape {
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }
// // DERIVED CLASS OF Triangle IS EquilateralTriangle

// class EquilateralTriangle extends Triangle {
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }

// public class inheritance {
// public static void main(String[] args) {
// Triangle t1 = new Triangle();
// t1.area(); // Dispaly area : it will print

// }
// }

// // 3. HIERACHIAL INHERITANCE

// // BASE CLASS = Shape
class Shape {
    public void area() {
        System.out.println("Display area : ");

    }
}

// DERIVED CLASS = Triangle from Shape class

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// DERIVED CLASS = circle from Shape class

class circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(); // Dispaly area : it will print

    }
}

// 4 . HYBRID INHERITANCE

// PAKAGES IN JAVA
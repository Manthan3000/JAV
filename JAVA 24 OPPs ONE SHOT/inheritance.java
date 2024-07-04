//  INHERITANCE

//INSERESE REUSEABLITY OF THE CODE 


//1 . SINGLE LAVEL INS=HERITANCE 

//BASE CLASS = Shape
class Shape {
    public void area() {
        System.out.println("Display area : ");

    }
}

// DERIVED CLASS = Triangle

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(); // Dispaly area : it will print

    }
}

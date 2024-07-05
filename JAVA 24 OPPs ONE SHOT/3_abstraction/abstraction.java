
// ABSTRACTION  = Abstract INFORMATION BY ABSTRACT KEYWORD

//rules 

//1.it always Start with ABSTRACT keyword,

//2.Can not be instansianted( OBJECTS) BASE CLASS >>> DERIVED CLASS

//BASE CLASS:
abstract class animal {
    public void walk() {

    }
}

// DERIVED CLASS :
class Horse extends animal {
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends animal {
    public void walk() {
        System.out.println("Walk on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk(); // Walk on 4 legs

    }
}

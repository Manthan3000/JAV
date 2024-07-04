//  // OOPs PILLERS

//   IMP =  POLYMORPHISM = MANY + FORMS
// 1 .COMPILE TIME POLYMORPHISM 

class student {
    public String name;
    public int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Your name is " + name + "& your age is " + age);
    }

}

public class polymorphism {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Manthan";
        s1.age = 20;
        s1.printInfo(s1.name, s1.age);

    }

}

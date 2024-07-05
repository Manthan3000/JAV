// ENCAPSULATION == DATA HIDING 

//DATA + FUNCTION == CLASS

//ENCAPLUCATION IS #WRAP DATA IN SINGLE UNIT & #INCRESE SECURATY
class Employee {

    // by useing static we can access variable anywere in progarm
    static int empId = 2; // empid we access
    int basicSal = 20000;
    int incentive = 200;
    int dobYear = 2006;

    void countSalaries() {
        System.out.println(basicSal + incentive);
    }

}

public class encap {
    public static void main(String[] args) {
        Employee e1 = new Employee(); // Employee() is constructor
        System.out.println(e1.basicSal); // 20000 by e1 object
        System.out.println(Employee.empId); // 2 Static var Global memory var
    }
}

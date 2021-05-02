package Assignment5.Sairam.assignment.main;

import Assignment5.Sairam.assignment.data.Class1;
import Assignment5.Sairam.assignment.singleton.Class2;

public class Class3 {
    public static void main(String args[]) {
        Class1 object1 = new Class1();
        object1.print();
        object1.print2();

        Class2 object2 = Class2.addString("hi");
        object2.printString();

    }
}

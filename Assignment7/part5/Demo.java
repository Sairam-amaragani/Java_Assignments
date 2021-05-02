package Assignment7.part5;

public class Demo {

    public static void main(String args[]){

        FirstOuterClass outer1 = new FirstOuterClass();
        SecondOuterClass outer2 = new SecondOuterClass();

        outer2.new SecondInnerClass(outer1, "hi!");
    }

}

package Assignment7.part5;
import Assignment7.part5.FirstOuterClass.FirstInnerClass;
public class SecondOuterClass {
     class SecondInnerClass extends FirstInnerClass{
            SecondInnerClass(FirstOuterClass f1,String s){
                f1.super(s);
            }
    }
}

package Assignment5.Sairam.assignment.singleton;

public class Class2 {
    public String s;
    public static Class2 addString(String input){
        Class2 object=new Class2();
        object.s=input;
        return object;

    }
    public void printString(){
        System.out.println(s);
    }
}

package Assignment7.part4;

public class CycleDemo {
    public static void main(String args[]){
        UniFactory f1=new UniFactory();
        Cycle c1= f1.getCycle();
        Cycle c2=new Bifactory().getCycle();
        Cycle c3=new Trifactory().getCycle();
        c1.NumberOfWheels();
        c2.NumberOfWheels();
        c3.NumberOfWheels();
    }
}

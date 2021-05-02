package Assignment7.part4;

public class Trifactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

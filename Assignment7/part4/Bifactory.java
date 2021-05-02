package Assignment7.part4;

public class Bifactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

package Assignment7.part4;

public class UniFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

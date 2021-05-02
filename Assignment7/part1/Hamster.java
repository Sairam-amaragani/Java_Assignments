package Assignment7.part1;

public class Hamster extends Rodent{
    Hamster(){
        System.out.println("I am Hamster");
    }

    @Override
    void Food() {
        System.out.println("apple");
    }
    @Override
    void Size() {
        System.out.println("8 inch");

    }
}

package Assignment7.part1;

public class RodentDemo {
    public static void main(String args[]){

        Rodent rodentList[]=new Rodent[4];
        rodentList[0] = new Mouse();
        rodentList[0].Food();
        rodentList[0].Size();

        rodentList[1] = new Gerbil();
        rodentList[1].Food();
        rodentList[1].Size();

        rodentList[2] = new Hamster();
        rodentList[2].Food();
        rodentList[2].Size();

        rodentList[3] = new Rodent() {
            @Override
            void Food() {

            }

            @Override
            void Size() {

            }
        };
        rodentList[3].Food();
        rodentList[3].Size();





    }
}

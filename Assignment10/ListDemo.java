package Assignment10;

public class ListDemo {
    public static void main(String args[]){
        SList<Integer> list = new SList<Integer>();
        SListIterator<Integer> it = list.Iterator();
        System.out.println(list.toString());
        System.out.println(it.isEmpty());
        it.add(1);
        it.add(2);
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());
        it.add(3);
        it.add(4);
        it.add(5);
        System.out.println(list.toString());
        it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());
    }
}

package Assignment10;


public class SListIterator<T> {

    private SNode<T> head;

    public SListIterator(SList<T> list) {
        this.head = list.head;

    }


    public void add(T data) {
        SNode<T> temp = head;
        if (!this.isEmpty()) {
            SNode<T> node = new SNode<T>(data);
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        } else {
            temp.data = data;
            temp.next = null;
        }

    }


    public void remove() {
        SNode<T> temp = head;
        SNode<T> prevTemp = new SNode<T>();
        if (temp.next == null) {
            temp.data = null;
        } else {
            while (temp.next != null) {
                prevTemp = temp;
                temp = temp.next;
            }

            prevTemp.next = null;
        }
    }

    public Boolean isEmpty(){
        if(head.data == null){
            return true;
        }
        else
            return false;
    }

}
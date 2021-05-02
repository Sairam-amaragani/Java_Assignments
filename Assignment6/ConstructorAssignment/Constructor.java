package Assignment6.ConstructorAssignment;

public class Constructor {
    public int a,b,c;
    public Constructor(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a);
        System.out.println(b);
    }
    public Constructor(int a,int b,int c){
        this(a,b);
        this.c=c;
        System.out.println(c);

    }
}

import java.util.Scanner;

public class Assignment9 {
    public static void main(String args[]){
        System.out.println("Enter input String:");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(input.matches("^[A-Z].*[.?!]$")){
            System.out.println("Match found");

        }
        else {
            System.out.println("Match not found");
        }
    }
}

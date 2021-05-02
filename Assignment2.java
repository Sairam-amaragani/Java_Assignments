import java.util.Scanner;

public class Assignment2 {
/*checkString method checks whether the given string contains all aphabetical letters or not .
if yes then returns true or else returns false.
*/

    public static boolean checkString(String input){
        Boolean alphabet[]= new Boolean[26];//initialize a boolean array of size 26.
        input=input.toLowerCase();
        for(int i=0;i<26;i++){
            alphabet[i]=false;//initialize all the values to false
        }
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='a' && input.charAt(i)<='z')//if the character is a alphabet.
            {
                alphabet[input.charAt(i) - 'a']=true;//we update the index of the alphabet to true.

            }
        }

        //check if any alphabet index is false which means that it doesn't occured.
        for (Boolean aBoolean : alphabet) {
            if (aBoolean != true) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(Assignment2.checkString(input));

    }
}
/* time complexity: O(n) where n stands for length of string.
Space complexity is constant.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter signup date:");
        String[] signup=sc.nextLine().split("-");
        System.out.println("Enter current date");
       String[] current=sc.nextLine().split("-");
        ArrayList<Integer> signupDate=new ArrayList<Integer>();
        ArrayList<Integer> currentDate=new ArrayList<Integer>();
        for(String x:signup){
                signupDate.add(Integer.parseInt(x));
        }
        for(String x:current){
            currentDate.add(Integer.parseInt(x));
        }
        checkRange(signupDate,currentDate);

    }

    public static void checkRange(ArrayList<Integer> signupDate, ArrayList<Integer> currentDate) {
        int[] endRange=addThirty(signupDate,currentDate.get(2));
        int[] startRange=minusThirty(signupDate,currentDate.get(2));

        if(currentDate.get(2)>signupDate.get(2)){
           if((currentDate.get(1)>endRange[1]) || (currentDate.get(1)==endRange[1] && currentDate.get(0)>endRange[0])){
               System.out.println(startRange[0]+" "+startRange[1]+ " "+startRange[2]);
               System.out.println(endRange[0]+" "+endRange[1]+ " "+endRange[2]);
           }
           else if((currentDate.get(1)<startRange[1]) && (currentDate.get(1)==startRange[1] && currentDate.get(0)<startRange[0])){
               System.out.println("No range Found");
           }
           else{
               System.out.println(startRange[0]+" "+startRange[1]+ " "+startRange[2]);
               System.out.println(currentDate.get(0)+" "+currentDate.get(1)+ " "+currentDate.get(2));
           }

        }
        else{
            System.out.println("Range not found");
        }
    }

    public static String convertToString(int[] startRange) {
       String date="";
        return date;
    }

    public static boolean leapYear(Integer year) {
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            return true;
        }
        else{
            return false;
        }

    }
    public static int[] addThirty(ArrayList<Integer> signupDate,int currentYear){
        int[] range1=new int[3];
        int[] leapYearDays=new int[]{31,29,31,30,31,30,31,31,30,31,30,31,31};
        int[] nonLeapYearDays=new int[]{31,28,31,30,31,30,31,31,30,31,30,31,31};
        if(leapYear(currentYear)){
                int x=leapYearDays[signupDate.get(1)-1]-signupDate.get(0);
                if(leapYearDays[signupDate.get(1)]>=30-x){
                    range1[0]=30-x;
                    range1[1]=signupDate.get(1)+1;
                }
                else{
                    range1[0]=30-x-leapYearDays[signupDate.get(1)];
                    range1[1]=signupDate.get(1)+2;
                }

        }
        else{
            int x=nonLeapYearDays[signupDate.get(1)-1]-signupDate.get(0);
            if(nonLeapYearDays[signupDate.get(1)]>=30-x){
                range1[0]=30-x;
                range1[1]=signupDate.get(1)+1;
            }
            else{
                range1[0]=30-x-nonLeapYearDays[signupDate.get(1)];
                range1[1]=signupDate.get(1)+2;
            }
        }
        if(signupDate.get(1)==12 && signupDate.get(0)>1) {
            range1[2] = currentYear + 1;
            range1[1] = 1;
        }else {
            range1[2]=currentYear;
        }
        return range1;

    }

    public static int[] minusThirty(ArrayList<Integer> signupDate,int currentYear){
        int[] range1=new int[3];
        int[] leapYearDays=new int[]{31,31,29,31,30,31,30,31,31,30,31,30,31,31};
        int[] nonLeapYearDays=new int[]{31,31,28,31,30,31,30,31,31,30,31,30,31,31};
        if(leapYear(currentYear)){

            int x=signupDate.get(0);
            if(leapYearDays[signupDate.get(1)-1]>30-x){
                range1[0]=leapYearDays[signupDate.get(1)-1]-(30-x);
                range1[1]=signupDate.get(1)-1;
            }
            else{
                range1[0]=leapYearDays[signupDate.get(1)-2]-(30-x-leapYearDays[signupDate.get(1)-1]);
                range1[1]=signupDate.get(1)-2;
            }

        }
        else{

            int x=signupDate.get(0);
            if(nonLeapYearDays[signupDate.get(1)-1]>30-x){
                range1[0]=nonLeapYearDays[signupDate.get(1)-1]-(30-x);
                range1[1]=signupDate.get(1)-1;
            }
            else{
                range1[0]=nonLeapYearDays[signupDate.get(1)-2]-(30-x-nonLeapYearDays[signupDate.get(1)-1]);
                range1[1]=signupDate.get(1)-2;
            }
        }
        if(signupDate.get(1)==1 && signupDate.get(0)<31) {
            range1[2] = currentYear - 1;
            range1[1] = 12;
        }else {
            range1[2]=currentYear;
        }
        return range1;

    }
}

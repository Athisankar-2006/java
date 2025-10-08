import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year :");
        int year=sc.nextInt();
        sc.close();
        boolean leap=(year%4 ==0 && year%100 !=0)||(year%400==0);
        System.out.println(leap? "leap year":"not a leap year");
    }
    
}

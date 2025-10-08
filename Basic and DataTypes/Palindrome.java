import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int x=sc.nextInt(), temp=x,rev=0;
        while(x>0){
            rev=rev*10+(x%10);
            x/=10;

        }
        System.out.println(temp==rev?"it is palindrom":"it's not palindrom");
    }
    
}

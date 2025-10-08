import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three number :");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int max=(a>b && a>c)?a:(b>c?b:c);
        sc.close();
        System.out.println("max number is :" + max);
    }
    
}

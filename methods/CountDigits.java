
import java.util.Scanner;

public class CountDigits {
    static int countn(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter numbers:");
        int n=sc.nextInt();
        System.out.println("count of this number digits is "+countn(n));
        sc.close();
    }
    
}

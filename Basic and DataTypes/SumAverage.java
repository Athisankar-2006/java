import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n number :");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            System.out.println("Enter number "+ i + " :");
            sum+=sc.nextDouble();
        }
        sc.close();
         System.out.println("sum of all number is "+sum);
         System.out.println("average of all number is "+ sum/n);
    }
    
}

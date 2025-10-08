import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principle amount :");
        double p=sc.nextDouble();
        System.out.println("enter the rate :");
        double r=sc.nextDouble();
         System.out.println("enter the time :");
        double t=sc.nextDouble();
        double si=(p*r*t)/100;
        System.out.println("simple interest is "+si);
    }
    
}

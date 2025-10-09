import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter your salary :");
        double s=sc.nextDouble();
        sc.close();
        double hra=0.2*s;
        double da=0.1*s;
        double gross=hra+da+s;
        System.out.println("gross salary is "+gross);
    }
    
}

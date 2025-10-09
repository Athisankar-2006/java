import java.util.Scanner;

public class CompareFloats {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two float number :");
        double a=sc.nextDouble(),b=sc.nextDouble();
        double epsilon=0.0001;
        sc.close();
        double d= Math.abs(a-b);
        System.out.println(d<epsilon?"it is equal":"it's not equal");
    }
    
}

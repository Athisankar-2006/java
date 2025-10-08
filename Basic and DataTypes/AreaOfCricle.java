import java.util.Scanner;

public class AreaOfCricle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        Double radius=sc.nextDouble();
        Double area= Math.PI*radius*radius;
        sc.close();
        System.out.println("Area of the Circle is "+ area);
    }
    
}

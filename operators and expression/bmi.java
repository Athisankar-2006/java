import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double w=sc.nextDouble();
        System.out.println("Enter your height: ");
        double h=sc.nextDouble();

        double bmiC=w/(h*h);
        sc.close();
        System.out.println(bmiC<18.5 ? "less weight": bmiC<25 ? "correct weight": bmiC<30 ? "over weight":"obese");
    }
    
}

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number :");
        Double a=sc.nextDouble(),b=sc.nextDouble();
        System.out.println("Enter the operator:('+','-','*','/')");
        char op=sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("addition: "+(a+b));
                break;
            case '-':
                System.out.println("addition: "+(a-b));
                break;
            case '*':
                System.out.println("addition: "+(a*b));
                break;
             case '/':
                System.out.println("addition: "+(a/b));
                break;
            default:
            System.out.println("invalid operator!..");
                break;
        }
    }
    
}

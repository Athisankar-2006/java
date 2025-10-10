import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if (num>0){
            System.out.println("positive number");
        }
        else if(num<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("it is zero");
        }
        sc.close();
    }
    
}

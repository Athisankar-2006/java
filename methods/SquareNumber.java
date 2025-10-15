import java.util.Scanner;

public class SquareNumber {

    static int square(int n){
        return n*n;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Squre="+square(num));
        sc.close();
    }
    
}

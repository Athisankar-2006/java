import java.util.Scanner;

public class MethodCall {

    static int mul(int n, int m){
        return n*m;
    }

    static void displayMessage(int x,int y){
        System.out.print(" multiplication :"+mul(x,y));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter two numbers:");
        int a=sc.nextInt(),b=sc.nextInt();
        displayMessage(a,b);
        sc.close();
    }
    
}

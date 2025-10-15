

import java.util.Scanner;

public class MaxOfTwo {

    static int max(int a,int b){
        return (a>b)?a:b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x=sc.nextInt(), y=sc.nextInt();
        System.out.println("maximum num =" + max(x,y));
        sc.close();
    }
    
}

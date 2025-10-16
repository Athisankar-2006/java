import java.util.Scanner;

public class Factorial {

static int findFacto(int num){
    int fact=1;
    for (int i=1;i<=num;i++){
        fact*=i;
    }
   return fact;
}


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        System.out.println(findFacto(n));
        sc.close();
    }
    
}

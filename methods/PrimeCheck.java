import java.util.Scanner;

public class PrimeCheck {


    static boolean isprime(int num){
        if (num<=1){
            return false;
        }

        for (int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("the number is "+(isprime(n)? "prime":"not prime"));
        sc.close();
    }
    
}

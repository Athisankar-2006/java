import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        boolean prime=true;
          if(num<=1){
            prime=false;
          }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                prime=false;
            }
        }
        if(prime){
            System.out.println("it is prime!");
        }else{
            System.out.println("it is not prime!");
        }
        sc.close();
    }
    
}

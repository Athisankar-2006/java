import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three value a,b,c :");
        double a=sc.nextDouble(), b=sc.nextDouble(),c=sc.nextDouble();
        sc.close();
        double d= b *b -4 *a *c;
        System.out.println(d>0? "two root": d==0? "one root":"imaginary root");
    }
    
}

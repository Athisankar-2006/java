import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sconds: ");
        int total=sc.nextInt();
        int h=total/3600;
        int m= (total%3600)/60;
        int s=total%60;
        System.out.println(h+"hours ,"+m +" minutes, "+s+" seconds");
    }
    
}

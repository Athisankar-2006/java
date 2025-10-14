import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string :");
        String str= sc.nextLine().trim();
        String[] world=str.split("\\s+");
        System.out.println(world.length);
        sc.close();
    }
    
}

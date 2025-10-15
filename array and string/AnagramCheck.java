import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String str1=sc.nextLine().replaceAll("\\s","").toLowerCase();
        System.out.print("ENter a another string:");
        String str2=sc.nextLine().replaceAll("\\s","").toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("it is not anagram ");
             
        }

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("it is annagram");
        }
        else{
            System.out.println("it is not  a anagram");
        }
        sc.close();


    }
    
}

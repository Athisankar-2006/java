
import java.util.Scanner;
public class GuessGame {

   public static void guessNumber() {
    Scanner sc= new Scanner(System.in);
    double number= 1+(int)(100*Math.random());
    System.out.println(" guess the number between 1-100 :");
    System.out.println("you have only five attemp to find !");
    int k=5;
    for (int i=0; i<k; i++){
        System.out.print("Enter your "+(i+1)+"number :");
        int guess =sc.nextInt();

        if(number == guess){
            System.out.println("you guessed the correct number at "+i+" attempt!..");
            break;
        }
        else if(number<guess){
            System.out.println("it is too high than the answer ");
        }
        else{
            System.out.println("it is too less than the answer");
        }
    }
    System.out.println("You've exhausted all attempts. The correct number was: "+number);


    sc.close();

   }


    public static void main(String[] args) {
       guessNumber();
    }
}



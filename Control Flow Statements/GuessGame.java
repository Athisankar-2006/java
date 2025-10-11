
    import java.util.*;
public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 7;
        while (true) {
            System.out.print("Guess number (1-10): ");
            int guess = sc.nextInt();
            if (guess == secret) {
                System.out.println("Correct! You win!");
                break;
            } else if (guess > secret)
                System.out.println("Too high!");
            else
                System.out.println("Too low!");
        }
        sc.close();
    }
}



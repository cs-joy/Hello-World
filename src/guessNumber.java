import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    /**
     * We are going to make a GAME
     * The concept is: Generating a random number and ask the user to guess the number,
     * continue asking until you receive the correct number
     * after 5 times of guessing show a game over message
     * 
     * Here is how it works!!
     * Show a welcome message on the screen
     * Ask the user's name and say hello to the user
     * Ask if we should start the game
     * After receiving a positive answer generate a random number and ask for the user guess
     * If the user guess is correct show a congratulation message
     * If the number is not correct, ask again until you receive the correct answer
     * As a hint, beside the first time, every time that you are asking for a number, tell the user to guess higher or lower
     * If the user failed 5 times, show a game over message and quit the game
     */
    
    public static void main(String[] args) {
        welcomeMessage("Welcome to Guessing GAME!");

        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();
        System.out.println("Hello, " + user);

        // get permission
        System.out.println("could you interested to start the game?");
        System.out.println("1. Start\n0. Exit");
        int userReply = scanner.nextInt();
        permissionCondition(userReply);
    }

    public static void welcomeMessage(String message) {
        System.out.println(message);
    }

    public static int permissionCondition(int userReply) {
        if (userReply == 1) {
            Random random = new Random();
            int guessNumber = random.nextInt(20);
            System.out.println(guessNumber);

            Scanner scanInput = new Scanner(System.in);

            for (int i = 1; i <= 5; i++) {
                System.out.println("Please guessing the number: ");
                int guess = scanInput.nextInt();

                if (guess == guessNumber) {
                    welcomeMessage("Congratulations, You are won the game!");
                    break;
                } else if (guess < guessNumber) {
                    System.out.println("Hint:: please guess higher number\n");
                } else {
                    System.out.println("Hint:: please guess lower number\n");
                }

                if(i == 5) {
                    System.out.println("Game Over, You failed!");
                    break;
                }
            }

        }
        return -1;
    }
}

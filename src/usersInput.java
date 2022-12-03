import java.util.Random;
import java.util.Scanner;

public class usersInput {
    public static void main(String[] args) {
        System.out.println("Users Input");

        System.out.println("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Answer was: " + num);

        // String
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Hello, " + name);

        // generating random number
        Random random = new Random();
        int numbers = random.nextInt();
        System.out.println("numbers: " + numbers);

        // bounding
        int numb = random.nextInt(20); // generating numbers between 1 to 20
        System.out.println("numb: " + numb);

        // bounding
        int n = random.nextInt(20) + 1; // generating numbers between 1 to 20
        System.out.println("n: " + n);
    }
}

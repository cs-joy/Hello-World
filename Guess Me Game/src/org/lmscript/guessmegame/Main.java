package org.lmscript.guessmegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Wonderland");
        System.out.println("May i have your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name);

        System.out.println("Shall we begin?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int beginAnswer = scanner.nextInt();

        while(beginAnswer != 1)
        {
            System.out.println("Shall we start?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("Please guess a number: ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWin = false;
        boolean shouldFinish = false;

        while(!shouldFinish)
        {
            timesTried++;

            if(timesTried < 5)
            {
                if(userInput == x)
                {
                    hasWin = true;
                    shouldFinish = true;
                } else if(userInput > x)
                {
                    System.out.println("Guess lower");
                    userInput = scanner.nextInt();
                }
                else
                {
                    System.out.println("Guess higher");
                    userInput = scanner.nextInt();
                }
            }
            else
            {
                shouldFinish = true;
            }
        }

        if(hasWin)
        {
            System.out.println("Congratulations! you have guessed in your " + timesTried + " guess.");
        }
        else
        {
            System.out.println("Game over!");
            System.out.println("The number was: " + x);
        }
    }
}

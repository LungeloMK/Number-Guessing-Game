package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int choice = 1;

        System.out.println("=== NUMBER GUESSING GAME ===");

        
        while (choice != 0) {

            System.out.println("\n1. Play Game");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                int randomNum = rand.nextInt(100) + 1;
                int maxAttempts = 5;
                boolean guessedCorrectly = false;

                System.out.println("\nA number is chosen between 1 and 100.");
                System.out.println("You have " + maxAttempts + " attempts.");

                
                for (int i = 0; i < maxAttempts; i++) {

                    System.out.print("Enter your guess: ");
                    int guess = input.nextInt();

                    if (guess > randomNum) {
                        System.out.println("Too high! Try a smaller number.");
                    } 
                    else if (guess < randomNum) {
                        System.out.println("Too low! Try a bigger number.");
                    } 
                    else {
                        System.out.println(
                            " Congratulations! You guessed the number in "
                            + (i + 1) + " attempts.");
                        guessedCorrectly = true;
                        break; 
                    }
                }

                if (!guessedCorrectly) {
                    System.out.println(" You've used all attempts.");
                    System.out.println("The correct number was: " + randomNum);
                }
            }
        }

        System.out.println("\nThank you for playing!");
        input.close();
    }
}

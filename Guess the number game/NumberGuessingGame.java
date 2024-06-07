import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            Random rand = new Random();
            int numberToGuess = rand.nextInt(100) + 1;
            int guess;
            int attempts = 0;

            System.out.println("Welcome to the number guessing game!");
            System.out.println("Guess a number between 1 and 100:");

            while (true) {
                guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations, you guessed the number in " + attempts + " tries!");
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again:");
                } else {
                    System.out.println("Your guess is too high. Try again:");
                }

                if (Math.abs(guess - numberToGuess) <= 10) {
                    System.out.println("You're very close!");
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}

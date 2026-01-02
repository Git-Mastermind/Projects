import java.util.Scanner;

public class Games {
    public void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz"); 
        else if (number % 5 == 0) 
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
        scanner.close();
    }

    public void numberGuesser() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        int numberOfGuesses = 7;
        while (true) {
            System.out.print("Guess (" + numberOfGuesses + "): ");
            int numberGuess = scanner.nextInt();

            if (numberOfGuesses == 1) {
                System.out.println("You ran out of guesses! The number was " + randomNumber);
                break;
            }
            else if (numberGuess > 100 || numberGuess < 1) {
                System.out.println("Invalid domain (1 - 100)!");
            }
            else if (numberGuess == randomNumber) {
                System.out.println("You win! The number was " + randomNumber);
                break;
            }
            else if (numberGuess > randomNumber) {
                System.out.println("Too high!");
                numberOfGuesses--;
            }
            else if (numberGuess < randomNumber) {
                System.out.println("Too low!");
                numberOfGuesses--;
            }
        }
        scanner.close();
    }
}

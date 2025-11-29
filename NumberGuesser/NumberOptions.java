package NumberGuesser;
import java.util.*;
public class NumberOptions {
    Scanner scanner = new Scanner(System.in);
    public int generateRandomNumber(String difficulty) {
        int randomNumber = 0;
        if (difficulty.equals("e")) {
            randomNumber = (int) (Math.random() * 10);
            return randomNumber;
        }
        else if (difficulty.equals("m")) {
            randomNumber = (int) (Math.random() * 50);
            return randomNumber;
        }
        else {
            randomNumber = (int) (Math.random() * 100);
            return randomNumber;
        }
    }

    public int inputNumber(int guesses, int maxDomain) {
        System.out.print("Guess (" + guesses + "): ");
        int guess = scanner.nextInt();
        scanner.nextLine();

        String reply = this.checkDomain(guess, maxDomain);


        if (reply.equals("0")) {
            return guess;
        }
        else {
            System.out.println(reply);
            return 1;
        }
        


    }   

    public String checkDomain(int number, int maxDomain) {
        if (number > maxDomain || number < 1) {
            return "Invalid Domain! 1 <= x <= " + maxDomain + "!";
        }
        else {
            return "0";
        }
    }

    public String processNumber(int randomNumber) {
        int number = this.inputNumber(48 ,67);
        if (number > randomNumber) {
            return "too high";
        }
        else if (number < randomNumber) {
            return "too low";
        }
        else if (number == randomNumber) {
            return "You win! The number was " + randomNumber + "!";
        }
        else {
            return "blank";
        }
        
    }
}

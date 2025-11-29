package NumberGuesser;
import java.util.*;
public class NumberGuesser {
    static int guesses = 5;
    static int maxDomain = 5;
    public static void main(String[] args) {
        NumberOptions number = new NumberOptions();
        Difficulty difficulty = new Difficulty();

        String gameDifficulty = difficulty.getDifficulty(); 
        int randomNumber = number.generateRandomNumber(gameDifficulty);

        if (gameDifficulty.equals("e")) {
            maxDomain = 10;
        }
        else if (gameDifficulty.equals("m")) {
            maxDomain = 50;
        }
        else {
            maxDomain = 100;
        }
        
        while (guesses > 0) {
            int guess = number.inputNumber(guesses, maxDomain);

            if (guess != 1) {
                System.out.println(number.processNumber(randomNumber));
                
            
            }
            
        }

    }
}

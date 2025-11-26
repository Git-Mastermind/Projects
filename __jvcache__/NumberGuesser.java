package __jvcache__;
import java.util.*
;public class NumberGuesser {

    public static void main(String[] args) {
        System.out.println(numberGuesser());
    }

    public static String numberGuesser() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = 0;
        int maximumGuess = 0;
        int guesses = 0;

        System.out.print("(E)asy, (M)edium or (H)ard? ");
        String inputDifficulty = scanner.nextLine();

        switch (inputDifficulty.toLowerCase()) {
            case "e":
                randomNumber = (int) (Math.random() * 10);
                maximumGuess = 10;
                guesses = 3;
                break;
            case "m":
                randomNumber = (int) (Math.random() * 50);
                maximumGuess = 50;
                guesses = 5;
                break;
            case "h":
                randomNumber = (int) (Math.random() * 100);
                maximumGuess = 100;
                guesses = 8;
        }

        
        while (guesses > 0) {
            System.out.print("Guess (" + guesses + "): ");
            int userGuess = scanner.nextInt();
            scanner.nextLine();

            if (userGuess > maximumGuess || userGuess < 1) {
                System.out.println("Invalid Domain (1 <= x <= " + maximumGuess + ")!");
                guesses++;
            }

            if (userGuess == randomNumber) {
                return "You win! The number was " + randomNumber + "!";
            }
            else if (userGuess < randomNumber) {
                System.out.println("Too Low!");
                guesses--;
            }
            else if (userGuess > randomNumber){
                System.out.println("Too High!");
                guesses--;
            }
        }
        
        if (guesses == 0) {
            return "You lose! The number was " + randomNumber;
        }
        return "blank";
        }
    
    
        
        
        
    }

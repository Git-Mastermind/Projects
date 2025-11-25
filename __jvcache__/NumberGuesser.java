package __jvcache__;
import java.util.*
;public class NumberGuesser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = 0;
        int maximumGuess = 0;

        System.out.print("(E)asy, (M)edium or (H)ard? ");
        String inputDifficulty = scanner.nextLine();

        switch (inputDifficulty.toLowerCase()) {
            case "e":
                randomNumber = (int) (Math.random() * 10);
                maximumGuess = 10;
                break;
            case "m":
                randomNumber = (int) (Math.random() * 50);
                maximumGuess = 50;
                break;
            case "h":
                randomNumber = (int) (Math.random() * 100);
                maximumGuess = 100;
        }

        int guesses = 5;
        while (guesses > 0) {
            System.out.print("Guess (" + guesses + "): ");
            int userGuess = scanner.nextInt();
            scanner.nextLine();

            if (userGuess > maximumGuess || userGuess < 1) {
                System.out.println("Invalid Domain (1 <= x <= " + maximumGuess + ")!");
                guesses++;
            }

            if (userGuess == randomNumber) {
                System.out.println("You win! The number was " + randomNumber + "!");
                System.exit(1);
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
            System.out.println("You lose! The number was " + randomNumber);
            System.exit(1);
        }
        
        
        
    }
}
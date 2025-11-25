package __jvcache__;
import java.util.*
;public class NumberGuesser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100);
        int guesses = 5;
        while (guesses > 0) {
            System.out.print("Guess (" + guesses + "): ");
            int userGuess = scanner.nextInt();
            scanner.nextLine();

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
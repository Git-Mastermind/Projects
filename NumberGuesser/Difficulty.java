package NumberGuesser;
import java.util.*

;public class Difficulty {
    Scanner scanner = new Scanner(System.in);
    NumberOptions number = new NumberOptions();

    public String getDifficulty() {
        System.out.print("(E)asy, (M)edium or (H)ard? ");
        String difficulty = scanner.nextLine();

        return difficulty;
    }
}

package JavaBookProjects;
import java.util.*;


public class PhraseOMatic {
    public static void main(String[] args) {
        Random random = new Random();
        String[] wordListOne = { "agnostic", "opinionated, voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed" };
        String[] wordListTwo = { "loosley coupled", "six sigma", "asychronous", "even driven", "pub-sub", "IoT", "cloud native", "service oriented"};
        String[] wordListThree = { "framework", "library", "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design", "orientation"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int oneIndex = random.nextInt(oneLength);
        int twoIndex = random.nextInt(twoLength);
        int threeIndex = random.nextInt(threeLength);

        String phraseOne = wordListOne[oneIndex];
        String phraseTwo = wordListTwo[twoIndex];
        String phraseThree = wordListThree[threeIndex];

        System.out.println("What we need is a " + phraseOne + " " + phraseTwo + " " + phraseThree + "!");
    }  
}

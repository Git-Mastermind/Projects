import java.util.*;
public class WordCounter {
    public int wordCounter(String story, String word) {
        int counter = 0;
        String[] words = story.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                counter++;
            }
        }
        return counter;

    }
}

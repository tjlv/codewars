import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShortestWord {

    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortestSentence = 0;
        for(String word : words) {
            if(word.toCharArray().length < shortestSentence || shortestSentence == 0) {
                shortestSentence = word.toCharArray().length;
            }
        }
        return shortestSentence;
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
}

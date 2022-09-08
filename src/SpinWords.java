import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.awt.SystemColor.text;

public class SpinWords {

    public static String spinWords(String s) {
        String[] words = s.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("Welcome"));
    }
}

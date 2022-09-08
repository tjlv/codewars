import java.util.regex.*;
/*
InstructionsTrolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
*/

public class Troll {

    public static String disemvowel(String str){
/* StringBuilder sb = new StringBuilder(str);
        int index = 0;
        for(char mander : str.toCharArray()) {
                if(mander == 'a'||mander == 'A' ||
                   mander == 'e'|| mander == 'E' ||
                   mander == 'i'|| mander == 'I' ||
                   mander == 'o'|| mander == 'O'||
                   mander == 'u'|| mander == 'U') {
                    sb.deleteCharAt(index);
                    index--;
                }
                index++;
        }
        return  sb.toString();
 */
        return str.replaceAll("(?i)[aeiou]" , "");
    }

    public static void main(String[] args){
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

}

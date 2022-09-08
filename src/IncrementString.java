import javax.annotation.processing.SupportedSourceVersion;

public class IncrementString {

    public static String incrementString(String str) {
        StringBuilder numbers = new StringBuilder();
        StringBuilder text = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.toCharArray()[i])){

                if(!numbers.toString().equals("") && Integer.parseInt(String.valueOf(str.toCharArray()[i])) ==0) {
                 text.append(str.toCharArray()[i]);
                } else {
                    numbers.append(str.toCharArray()[i]);
                }
            } else {
                text.append(str.toCharArray()[i]);
            }
        }

       return String.format(text+"%0" + numbers.length() + "d",
                Integer.parseInt(String.valueOf(numbers)) + 1);
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foobar000"));
        System.out.println(incrementString("foobar001"));
        System.out.println(incrementString("foobar99"));
        System.out.println(incrementString("foobar099"));

    }
}

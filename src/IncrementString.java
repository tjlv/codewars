import java.util.regex.Pattern;

public class IncrementString {
    static final Pattern NUMBER = Pattern.compile("\\d+");
    public static String incrementString(String str) {
        StringBuilder numbers = new StringBuilder();
        StringBuilder text = new StringBuilder();
        long number;

        for(int i = str.length() -1; i >= 0; i--) {
            if(!Character.isDigit(str.toCharArray()[i])) {
                text.append(str.substring(0,(i+1)));
                break;
            }
            int var = Integer.parseInt(String.valueOf(str.toCharArray()[i]));
            numbers.append(var);
            if(var < 9) {
                int calc = Integer.parseInt(String.valueOf(numbers));
                numbers = new StringBuilder(""+calc);
                text.append(str.substring(0,(i)));
                break;
            }
        }

        if(numbers.length() < 1){
            numbers.append(0);
        }

        return text+""+NUMBER.matcher(numbers.reverse())
                .replaceFirst(s -> String.format(
                        "%0" + s.group().length() + "d",
                        Long.parseLong(s.group()) + 1));
    }


    public static void main(String[] args) {
        System.out.println(incrementString("foobar099"));


    }
}

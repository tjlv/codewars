package Professional;

public class HumanReadableTime {
    public static String makeReadable(int s) {
        int sec = s % 60;
        int min = (s / 60)%60;
        int hours = (s/60)/60;

        String strSec=(sec<10)?"0"+Integer.toString(sec):Integer.toString(sec);
        String strmin=(min<10)?"0"+Integer.toString(min):Integer.toString(min);
        String strHours=(hours<10)?"0"+Integer.toString(hours):Integer.toString(hours);
        
        return strHours + ":" + strmin + ":" + strSec;
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
    }
}

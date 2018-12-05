import java.util.*;

public class Spavanac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);

        minute -= 45;
        if (minute < 0) {
            hour--;
            if (hour < 0) {
                hour += 24;
            }
            minute += 60;
        }

        System.out.println(hour + " " + minute);
    }
}

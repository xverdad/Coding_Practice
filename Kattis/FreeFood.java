import java.util.*;

public class FreeFood {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scan.nextLine());

        int[] days = new int[numberOfDays*2];
        for(int i = 0; i < numberOfDays*2; i++) {
            days[i] = scan.nextInt();
        }

        boolean[] events = new boolean[366];
        for(int i = 0; i < days.length; i += 2) {
            int start = days[i];
            int end = days[i+1];
            for (int j = start; j <= end; j++) {
                events[j] = true;
            }
        }

        int total = 0;
        for(int i = 0; i < events.length; i++) {
            if (events[i]) total++;
        }

        System.out.println(total);
        }
    }

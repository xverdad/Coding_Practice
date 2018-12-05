import java.util.*;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int count = 1;

        for (int i = 0; i < input; i++) {
            System.out.println(count + " Abracadabra");
            count++;
        }

        scan.close();
    }
}

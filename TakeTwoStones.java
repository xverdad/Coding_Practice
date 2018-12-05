import java.util.*;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int input = Integer.parseInt(scan.nextLine());

        if (input % 2 == 0) {
            System.out.println("Bob");
        }
        else {
            System.out.println("Alice");
        }

        scan.close();
    }
}

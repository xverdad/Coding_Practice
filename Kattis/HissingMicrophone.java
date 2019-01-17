import java.util.*;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean doubleS = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 's') {
                if (i + 1 < input.length() && input.charAt(i + 1) == 's') {
                    System.out.println("hiss");
                    doubleS = true;
                    break;
                }
            }
        }

        if (!doubleS) {
            System.out.println("no hiss");
        }

        scan.close();
    }
}

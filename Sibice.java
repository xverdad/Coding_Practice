import java.util.*;

public class Sibice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfMatches = scan.nextInt();
        double width = scan.nextDouble();
        double height = scan.nextDouble();
        double hypotenuse = Math.hypot(width, height);
        int lengthOfMatch;

        for (int i = 0; i < numberOfMatches; i++) {
            lengthOfMatch = scan.nextInt();
            if (lengthOfMatch > hypotenuse) {
                System.out.println("NE");
            }
            else {
                System.out.println("DA");
            }
        }
        scan.close();
    }
}

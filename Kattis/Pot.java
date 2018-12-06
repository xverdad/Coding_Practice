import java.util.*;

public class Pot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double output = 0;
        String number;

        for (int i = 0; i < n; i++) {
            number = scan.next();
            output += Math.pow(Double.parseDouble(number.substring(0, number.length() - 1)),
                    Double.parseDouble(number.substring(number.length() - 1)));
        }

        System.out.printf("%.0f", output);
    }
}

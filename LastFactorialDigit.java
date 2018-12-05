import java.util.*;

public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCases = scan.nextInt();

        for (int i = 0; i < numberOfCases; i++) {
            int factorial = 1;
            int numberFactorial = scan.nextInt();
            for (int j = 1; j <= numberFactorial; j++) {
                factorial = factorial * j;
            }
            String output = Integer.toString(factorial);
            System.out.println(output.charAt(output.length() - 1));
        }
        scan.close();
    }
}

import java.util.*;

public class Filip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        StringBuilder number1 = new StringBuilder(input[0]);
        StringBuilder number2 = new StringBuilder(input[1]);

        number1.reverse();
        number2.reverse();

        if (Integer.parseInt(number1.toString()) > Integer.parseInt(number2.toString())) {
            System.out.println(number1.toString());
        }
        else {
            System.out.println(number2.toString());
        }

        scan.close();
    }
}

import java.util.*;

public class Autori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        StringBuilder output = new StringBuilder();
        output.append(input.charAt(0));

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-') {
                output.append(input.charAt(i+1)) ;
            }
        }
        System.out.println(output);

        scan.close();
    }
}

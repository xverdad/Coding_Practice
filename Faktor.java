import java.util.*;

public class Faktor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfArticles = scan.nextInt();
        int impactFactor = scan.nextInt();
        int output = numberOfArticles * impactFactor;

        output -= numberOfArticles;
        output += 1;

        System.out.println(output);

        scan.close();
    }
}
